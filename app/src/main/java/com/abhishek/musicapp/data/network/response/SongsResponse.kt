package com.abhishek.musicapp.data.network.response

data class SongsResponse(
    val data : List<SongResponse>
) {
    fun toSongsList() = data.map { it.toSong() }
}
