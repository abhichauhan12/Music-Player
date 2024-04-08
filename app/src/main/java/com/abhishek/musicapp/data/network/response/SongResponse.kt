package com.abhishek.musicapp.data.network.response

import com.abhishek.musicapp.domain.model.Song
import com.abhishek.musicapp.utils.COVER_URL
import com.google.gson.annotations.SerializedName

data class SongResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("status")
    val audioStatus: String,
    @SerializedName("name")
    val audioName: String,
    @SerializedName("artist")
    val artistName: String,
    @SerializedName("accent")
    val backgroundColor: String,
    @SerializedName("cover")
    val imageId: String,
    @SerializedName("top_track")
    val isTopTrack: Boolean,
    @SerializedName("url")
    val audioUrl: String
) {

    fun hasValidAudioUrl() = audioUrl.startsWith("https:")

    fun toSong() : Song{
        return Song(
            id = id,
            audioName = audioName,
            artistName = artistName,
            backgroundColor = backgroundColor,
            imageId = imageId,
            isTopTrack = isTopTrack,
            audioUrl = audioUrl,
        )
    }
}
