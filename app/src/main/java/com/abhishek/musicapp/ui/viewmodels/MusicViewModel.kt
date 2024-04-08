package com.abhishek.musicapp.ui.viewmodels

import android.app.Application
import android.os.CountDownTimer
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.media3.common.MediaItem
import androidx.media3.common.PlaybackException
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import com.abhishek.musicapp.domain.model.PlayingSongMeta
import com.abhishek.musicapp.domain.model.Song
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject


@HiltViewModel
class MusicViewModel @Inject constructor(
    private val application: Application
) : AndroidViewModel(application) {

    private var playWhenReady: Boolean = true
    private var mediaItemIndex: Int = 0

    private lateinit var player: ExoPlayer
    var audioList: List<Song> = ArrayList()

    private val _currentlyPlaying = MutableStateFlow<PlayingSongMeta?>(null)
    val currentlyPlaying = _currentlyPlaying.asStateFlow()

    private val _isAudioChanged = MutableStateFlow(AudioChangeStatus.IDLE)
    val isAudioChanged = _isAudioChanged.asStateFlow()

    private val playerPlaybackTimer = object : CountDownTimer(Long.MAX_VALUE, 100) {
        override fun onTick(millisUntilFinished: Long) {
            _currentlyPlaying.update {
                val index = audioList.indexOf(it?.song ?: 0)
                it?.let {
                    PlayingSongMeta(
                        songIndexInQueue = index,
                        song = it.song,
                        currentPositionMs = player.currentPosition,
                        totalDurationMs = player.duration,
                        isPlaying = player.isPlaying
                    )
                }
            }
        }

        override fun onFinish() {}
    }

    fun updateAudioList(selectedAudioIndex: Int, newAudioList: List<Song>) {
        mediaItemIndex = selectedAudioIndex
        audioList = newAudioList
        updateExoplayer()
    }

    private fun updateExoplayer() {
        player.clearMediaItems()
        player.setMediaItems(audioList.map { it.toMediaItem() }, mediaItemIndex, 0)
    }

    fun playNext() {
        if (::player.isInitialized) {
            player.seekToNextMediaItem()
        }
    }

    fun hasNextItem(): Boolean {
        if (::player.isInitialized) {
            return player.hasNextMediaItem()
        }
        return false
    }

    fun hasPreviousItem(): Boolean {
        if (::player.isInitialized) {
            return player.hasPreviousMediaItem()
        }
        return false
    }

    fun playPrevious() {
        if (::player.isInitialized) {
            player.seekToPreviousMediaItem()
        }
    }

    fun handlePlayPause() {
        if (::player.isInitialized) {
            if (player.isPlaying) {
                player.pause()
            } else {
                player.play()
            }
        }
    }

    fun initializePlayer() {
        if (::player.isInitialized) return
        player = ExoPlayer.Builder(application)
            .build().apply {
                addListener(playbackListener)
                playWhenReady = this@MusicViewModel.playWhenReady
                prepare()
            }
    }

    fun releasePlayer() {
        if (::player.isInitialized) {
            player.pause()
        }
    }

    private val playbackListener = object : Player.Listener {
        override fun onPlaybackStateChanged(playbackState: Int) {
            when (playbackState) {
                ExoPlayer.STATE_BUFFERING,
                ExoPlayer.STATE_READY -> startPlayerPlaybackTimer()

                else -> cancelPlayerPlaybackTimer()
            }
        }

        override fun onMediaItemTransition(mediaItem: MediaItem?, reason: Int) {
            mediaItem?.let { item ->
                _isAudioChanged.update { AudioChangeStatus.CHANGING }
                val currentlyPlayingId = item.mediaId
                _currentlyPlaying.value =
                    audioList.find { it.properAudioUrl == currentlyPlayingId }?.let {
                        val index = audioList.indexOf(it)
                        PlayingSongMeta(
                            songIndexInQueue = index,
                            song = it,
                            currentPositionMs = 0,
                            totalDurationMs = 0,
                            isPlaying = false
                        )
                    }
                _isAudioChanged.update { AudioChangeStatus.CHANGED }
            }
        }
    }

    private fun cancelPlayerPlaybackTimer() {
        playerPlaybackTimer.cancel()
    }

    private fun startPlayerPlaybackTimer() {
        cancelPlayerPlaybackTimer()
        playerPlaybackTimer.start()
    }
}

enum class AudioChangeStatus {
    IDLE,
    CHANGING,
    CHANGED
}