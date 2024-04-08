package com.abhishek.musicapp.data.network.apis

import com.abhishek.musicapp.data.network.response.SongsResponse
import retrofit2.Call
import retrofit2.http.GET

interface SongsAPI {
    @GET("items/songs")
    fun getSongs(): Call<SongsResponse>
}