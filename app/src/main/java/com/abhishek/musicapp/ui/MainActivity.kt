package com.abhishek.musicapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.abhishek.musicapp.R
import com.abhishek.musicapp.ui.viewmodels.HomeViewModel
import com.abhishek.musicapp.ui.viewmodels.MusicViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val homeViewModel by viewModels<HomeViewModel>()
    private val mediaViewModel by viewModels<MusicViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        homeViewModel.getSongs()
    }

    override fun onResume() {
        super.onResume()
        mediaViewModel.initializePlayer()
    }

    override fun onStop() {
        super.onStop()
        mediaViewModel.releasePlayer()
    }
}
