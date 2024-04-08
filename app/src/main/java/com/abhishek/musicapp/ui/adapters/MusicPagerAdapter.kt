package com.abhishek.musicapp.ui.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class MusicPagerAdapter(
    fragment: Fragment,
    private val pages : List<Fragment>,
) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return pages.size
    }

    override fun createFragment(position: Int): Fragment {
        return pages[position]
    }
}