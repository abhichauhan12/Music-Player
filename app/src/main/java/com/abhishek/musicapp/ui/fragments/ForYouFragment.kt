package com.abhishek.musicapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.abhishek.musicapp.R
import com.abhishek.musicapp.databinding.FragmentForYouBinding
import com.abhishek.musicapp.ui.adapters.AudioAdapter
import com.abhishek.musicapp.ui.viewmodels.HomeViewModel
import com.abhishek.musicapp.ui.viewmodels.MusicViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class ForYouFragment : Fragment(R.layout.fragment_for_you) {

    private lateinit var forYouBinding: FragmentForYouBinding
    private lateinit var adapterForYou: AudioAdapter
    private val homeViewModel by activityViewModels<HomeViewModel>()
    private val musicViewModel by activityViewModels<MusicViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        forYouBinding = FragmentForYouBinding.bind(view)
        initViews()
        attachObservers()
    }

    private fun initViews() {
        adapterForYou = AudioAdapter(
            onSongPressed = { audioIndex ->
                musicViewModel.updateAudioList(
                    selectedAudioIndex = audioIndex,
                    newAudioList = adapterForYou.currentList
                )
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToSongFragment())
            }
        )

        forYouBinding.audioList.apply {
            adapter = adapterForYou
            layoutManager = LinearLayoutManager(requireContext())
        }

    }

    private fun attachObservers() {
        lifecycleScope.launch {
            homeViewModel.songList.collectLatest {
                adapterForYou.submitList(it)
            }
        }
    }
}