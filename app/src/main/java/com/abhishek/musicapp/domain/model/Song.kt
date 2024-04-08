package com.abhishek.musicapp.domain.model

import android.os.Parcelable
import android.util.Log
import androidx.media3.common.MediaItem
import com.abhishek.musicapp.utils.COVER_URL
import kotlinx.parcelize.Parcelize
import kotlin.math.abs

@Parcelize
data class Song(
    val id: Int,
    val audioName: String,
    val artistName: String,
    val backgroundColor: String,
    val imageId: String,
    val isTopTrack: Boolean,
    val audioUrl: String,
) : Parcelable {
    val imageUrl = COVER_URL + imageId
    val properAudioUrl = audioUrl.replace(" ", "")

    fun toMediaItem(): MediaItem = MediaItem
        .Builder()
        .setMediaId(properAudioUrl)
        .setUri(properAudioUrl)
        .build()
}

data class PlayingSongMeta(
    val songIndexInQueue: Int,
    val song: Song,
    val currentPositionMs: Long,
    val totalDurationMs: Long,
    val isPlaying: Boolean,
)

fun Long.stringForTime(): String {
    val totalSeconds = if(this <= 0) 0 else this / 1000
    val seconds = totalSeconds % 60
    val minutes = totalSeconds / 60 % 60
    val hours = totalSeconds / 3600
    return if (hours > 0) {
        "%d:%02d:%02d".format(hours, minutes, seconds)
    } else {
        "%02d:%02d".format(minutes, seconds)
    }
}