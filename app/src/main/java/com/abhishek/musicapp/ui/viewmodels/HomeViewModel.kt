package com.abhishek.musicapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abhishek.musicapp.domain.model.Song
import com.abhishek.musicapp.domain.repository.NetworkRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val networkRepository: NetworkRepository
) : ViewModel() {

    private val _songList = MutableStateFlow<List<Song>>(value = ArrayList())
    val songList = _songList.asStateFlow()

    fun getSongs() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                if (songList.value.isEmpty()) {
                    val response = networkRepository.getSongs()
                    response.data?.let { songsResponse ->
                        val songs = songsResponse.data.filter {
                            it.hasValidAudioUrl()
                        }.map {
                            it.toSong()
                        }
                        _songList.value = songs
                    }
                }
            }
        }
    }
}