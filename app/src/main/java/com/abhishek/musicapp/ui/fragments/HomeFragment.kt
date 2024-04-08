package com.abhishek.musicapp.ui.fragments

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.viewpager2.widget.ViewPager2
import com.abhishek.musicapp.R
import com.abhishek.musicapp.databinding.FragmentHomeBinding
import com.abhishek.musicapp.domain.model.PlayingSongMeta
import com.abhishek.musicapp.ui.adapters.MusicPagerAdapter
import com.abhishek.musicapp.ui.viewmodels.AudioChangeStatus
import com.abhishek.musicapp.ui.viewmodels.MusicViewModel
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var homeBinding: FragmentHomeBinding
    private lateinit var pagerAdapter: MusicPagerAdapter
    private lateinit var miniPlayerAdapter: MusicPagerAdapter
    private val musicViewModel by activityViewModels<MusicViewModel>()
    private var isPagerManuallySwiped = false

    private val pageChangeCallbackListener = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(pageIndex: Int) {
            Log.d("tetete", "onPageSelected: $pageIndex $isPagerManuallySwiped")
            if (isPagerManuallySwiped) {
                val currentlyPlayingIndex =
                    musicViewModel.currentlyPlaying.value?.songIndexInQueue ?: return
                if (pageIndex > currentlyPlayingIndex) musicViewModel.playNext()
                else musicViewModel.playPrevious()
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        homeBinding = FragmentHomeBinding.bind(view)
        val list = ArrayList<Fragment>()
        list.add(ForYouFragment())
        list.add(TopTracksFragment())

        pagerAdapter = MusicPagerAdapter(this, list)
        homeBinding.viewPager.adapter = pagerAdapter

        TabLayoutMediator(homeBinding.tabs, homeBinding.viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "For You"
                1 -> tab.text = "Top Tracks"
            }
        }.attach()
        initUI()
        attachObservers()
    }

    private fun initUI() {
        updateMiniPlayerPager()
        homeBinding.playPauseButton.setOnClickListener { musicViewModel.handlePlayPause() }

        activity?.window?.statusBarColor = Color.parseColor("#000000")

    }

    private fun updateMiniPlayerPager() {
        miniPlayerAdapter =
            MusicPagerAdapter(this, musicViewModel.audioList.map { MiniPlayerFragment(it) })
        homeBinding.miniPlayerViewPager.apply {
            adapter = miniPlayerAdapter
        }
    }

    private fun attachObservers() {
        lifecycleScope.launch {
            launch {
                musicViewModel.currentlyPlaying.collectLatest {
                    it?.let { updateUi(it) }
                }
            }

            launch {
                musicViewModel.isAudioChanged.collectLatest { audioChangeStatus ->
                    if (audioChangeStatus == AudioChangeStatus.CHANGED) {
                        val currentAudioIndex =
                            musicViewModel.currentlyPlaying.value?.songIndexInQueue
                                ?: return@collectLatest
                        homeBinding.miniPlayerViewPager.post {
                            Log.d("tetete", "set to false")
                            isPagerManuallySwiped = false
                            Log.d("tetete", "switing to $currentAudioIndex")
                            homeBinding.miniPlayerViewPager.setCurrentItem(currentAudioIndex, true)
                            Log.d("tetete", "set to true")
                            isPagerManuallySwiped = true
                        }
                    }
                }
            }
        }

    }

    private fun updateUi(playingSongMeta: PlayingSongMeta) {
        if (homeBinding.miniPlayerViewPager.isVisible) {
            homeBinding.playPauseButton.setImageResource(
                if (playingSongMeta.isPlaying) R.drawable.ic_pause
                else R.drawable.ic_play
            )
        } else if (playingSongMeta.isPlaying) {
            // Show Mini Player ViewPager when a song is playing
            homeBinding.miniPlayerViewPager.visibility = View.VISIBLE
            homeBinding.playPauseButton.visibility = View.VISIBLE
            homeBinding.playPauseButton.setImageResource(R.drawable.ic_pause)
            homeBinding.tabs.background = ColorDrawable(Color.BLACK)
            val params = homeBinding.viewPager.getLayoutParams()

        }
    }

    override fun onResume() {
        super.onResume()
        homeBinding.miniPlayerViewPager.registerOnPageChangeCallback(pageChangeCallbackListener)
    }

    override fun onStop() {
        super.onStop()
        isPagerManuallySwiped = false
        homeBinding.miniPlayerViewPager.unregisterOnPageChangeCallback(pageChangeCallbackListener)
    }

}








