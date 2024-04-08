package com.abhishek.musicapp.ui.fragments

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.abhishek.musicapp.R
import com.abhishek.musicapp.databinding.FragmentForYouBinding
import com.abhishek.musicapp.databinding.FragmentHomeBinding
import com.abhishek.musicapp.databinding.FragmentMiniPlayerBinding
import com.abhishek.musicapp.domain.model.Song
import com.abhishek.musicapp.ui.viewmodels.HomeViewModel
import com.abhishek.musicapp.ui.viewmodels.MusicViewModel
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MiniPlayerFragment(val song : Song) : Fragment(R.layout.fragment_mini_player) {

    private lateinit var binding: FragmentMiniPlayerBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMiniPlayerBinding.bind(view)
        initUI(song)
    }

    private fun initUI(song: Song) {
        binding.audioName.text = song.audioName

        Glide.with(binding.root)
            .load(song.imageUrl)
            .placeholder(R.mipmap.ic_launcher)
            .apply(RequestOptions.circleCropTransform())
            .into(binding.audioImage)

        binding.layoutBackground.background = ColorDrawable(Color.parseColor(song.backgroundColor))
        binding.root.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToSongFragment())
        }
    }
}