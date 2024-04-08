package com.abhishek.musicapp.domain.repository

import com.abhishek.musicapp.data.network.response.SongsResponse
import com.abhishek.musicapp.data.network.apis.SongsAPI
import com.abhishek.musicapp.data.network.FetchStatus
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import com.abhishek.musicapp.domain.core.Result

class NetworkRepository @Inject constructor(
    private val songsAPI: SongsAPI,
) {
    suspend fun getSongs(): Result<SongsResponse> {
        return withContext(Dispatchers.IO) {
            try {
                val response = songsAPI.getSongs().execute()
                if (response.isSuccessful) {
                    Result(FetchStatus.FETCHED, response.body())
                } else
                    Result(FetchStatus.FAILURE("Failed to fetch songs: ${response.code()}"), null)
            } catch (e: Exception) {
                Result(FetchStatus.FAILURE(e.message), null)
            }
        }
    }
}
