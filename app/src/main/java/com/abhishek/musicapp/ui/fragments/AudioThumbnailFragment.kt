package com.abhishek.musicapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.abhishek.musicapp.R
import com.abhishek.musicapp.databinding.FragmentAudioThumbnailBinding
import com.bumptech.glide.Glide

class AudioThumbnailFragment(
    private val thumbnailUrl: String
) : Fragment(R.layout.fragment_audio_thumbnail) {

    private lateinit var binding: FragmentAudioThumbnailBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAudioThumbnailBinding.bind(view)
        Glide.with(binding.root).load(thumbnailUrl).into(binding.audioThumbnail)
    }

}