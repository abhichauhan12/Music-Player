package com.abhishek.musicapp.ui.fragments

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.viewpager2.widget.ViewPager2
import com.abhishek.musicapp.R
import com.abhishek.musicapp.databinding.FragmentSongBinding
import com.abhishek.musicapp.domain.model.PlayingSongMeta
import com.abhishek.musicapp.domain.model.stringForTime
import com.abhishek.musicapp.ui.adapters.MusicPagerAdapter
import com.abhishek.musicapp.ui.viewmodels.AudioChangeStatus
import com.abhishek.musicapp.ui.viewmodels.MusicViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SongFragment : Fragment(R.layout.fragment_song) {

    private lateinit var binding: FragmentSongBinding
    private val musicViewModel by activityViewModels<MusicViewModel>()
    private lateinit var pagerAdapter: MusicPagerAdapter

    private var isPagerManuallySwiped = false

    private val pageChangeCallbackListener = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(pageIndex: Int) {
            if (isPagerManuallySwiped) {
                val currentlyPlayingIndex = musicViewModel.currentlyPlaying.value?.songIndexInQueue ?: return
                if (pageIndex > currentlyPlayingIndex) musicViewModel.playNext()
                else musicViewModel.playPrevious()
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSongBinding.bind(view)
        initUi()
        attachObservers()
    }

    private fun initUi() {
        binding.previousButton.setOnClickListener {
            isPagerManuallySwiped = false
            musicViewModel.playPrevious()
        }
        binding.nextButton.setOnClickListener {
            isPagerManuallySwiped = false
            musicViewModel.playNext()
        }
        binding.playPauseMusic.setOnClickListener { musicViewModel.handlePlayPause() }
        initPager()
    }


    private fun initPager() {
        pagerAdapter = MusicPagerAdapter(
            this,
            musicViewModel.audioList.map {
                AudioThumbnailFragment(thumbnailUrl = it.imageUrl)
            }
        )
        binding.songViewPager.adapter = pagerAdapter
    }

    private fun buttonsCheck() {
        val hasNextItem = musicViewModel.hasNextItem()
        val hasPreviousItem = musicViewModel.hasPreviousItem()

        if (hasNextItem && hasPreviousItem) {
            binding.nextButton.alpha = 1.0f
            binding.previousButton.alpha = 1.0f
            binding.nextButton.isEnabled = true
            binding.previousButton.isEnabled = true
        } else if (!hasNextItem && hasPreviousItem) {
            binding.nextButton.alpha = 0.3f
            binding.previousButton.alpha = 1.0f
            binding.nextButton.isEnabled = false
            binding.previousButton.isEnabled = true
        } else if (hasNextItem && !hasPreviousItem) {
            binding.nextButton.alpha = 1.0f
            binding.previousButton.alpha = 0.3f
            binding.nextButton.isEnabled = true
            binding.previousButton.isEnabled = false
        } else {
            binding.nextButton.alpha = 0.3f
            binding.previousButton.alpha = 0.3f
            binding.nextButton.isEnabled = false
            binding.previousButton.isEnabled = false
        }
    }


    private fun attachObservers() {
        lifecycleScope.launch {

            launch {
                musicViewModel.currentlyPlaying.collectLatest { song ->
                    song?.let { updateUi(it) }
                }
            }

            launch {
                musicViewModel.isAudioChanged.collectLatest { audioChangeStatus ->
                    buttonsCheck()
                    if (audioChangeStatus == AudioChangeStatus.CHANGED) {
                        val currentAudioIndex =
                            musicViewModel.currentlyPlaying.value?.songIndexInQueue
                                ?: return@collectLatest
                        binding.songViewPager.post {
                            isPagerManuallySwiped = false
                            binding.songViewPager.setCurrentItem(currentAudioIndex, true)
                            isPagerManuallySwiped = true
                        }
                    }
                }
            }

        }
    }

    private fun updateUi(songMeta: PlayingSongMeta) {
        binding.songName.text = songMeta.song.audioName
        binding.artistName.text = songMeta.song.artistName
        binding.currentPlaybackDuration.text = songMeta.currentPositionMs.stringForTime()
        binding.totalPlaybackDuration.text = songMeta.totalDurationMs.stringForTime()
        binding.playPauseMusic.setImageResource(if (songMeta.isPlaying) R.drawable.ic_pause else R.drawable.ic_play)
        binding.layoutBackground.background =
            ColorDrawable(Color.parseColor(songMeta.song.backgroundColor))
        binding.playbackSeekbar.max = songMeta.totalDurationMs.toInt()
        binding.playbackSeekbar.progress = songMeta.currentPositionMs.toInt()
        activity?.window?.statusBarColor = Color.parseColor(songMeta.song.backgroundColor)
    }

    override fun onResume() {
        super.onResume()
        binding.songViewPager.registerOnPageChangeCallback(pageChangeCallbackListener)
    }

    override fun onStop() {
        super.onStop()
        binding.songViewPager.unregisterOnPageChangeCallback(pageChangeCallbackListener)
    }

}