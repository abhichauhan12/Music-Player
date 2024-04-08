package com.abhishek.musicapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.abhishek.musicapp.R
import com.abhishek.musicapp.databinding.FragmentTopTracksBinding
import com.abhishek.musicapp.ui.adapters.AudioAdapter
import com.abhishek.musicapp.ui.viewmodels.HomeViewModel
import com.abhishek.musicapp.ui.viewmodels.MusicViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class TopTracksFragment : Fragment(R.layout.fragment_top_tracks) {

    private lateinit var topTracksFragment: FragmentTopTracksBinding
    private val homeViewModel by activityViewModels<HomeViewModel> ()
    private lateinit var adapterTopTracks: AudioAdapter
    private val musicViewModel by activityViewModels<MusicViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        topTracksFragment = FragmentTopTracksBinding.bind(view)
        initViews()
        attachObservers()
    }

    private fun initViews(){
        adapterTopTracks = AudioAdapter(
            onSongPressed = {audioIndex ->
                musicViewModel.updateAudioList(
                    selectedAudioIndex = audioIndex,
                    newAudioList = adapterTopTracks.currentList
                )
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToSongFragment())

            }
        )

        topTracksFragment.recyclerViewTopTracks.apply {
            adapter = adapterTopTracks
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    private fun attachObservers(){
        lifecycleScope.launch {
            homeViewModel.songList.collectLatest {
                val filterList = it.filter { it.isTopTrack }
                adapterTopTracks.submitList(filterList)
            }
        }
    }
}
