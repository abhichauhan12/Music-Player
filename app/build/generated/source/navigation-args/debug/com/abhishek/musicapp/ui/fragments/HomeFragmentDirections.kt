package com.abhishek.musicapp.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.abhishek.musicapp.R

public class HomeFragmentDirections private constructor() {
  public companion object {
    public fun actionHomeFragmentToSongFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_songFragment)
  }
}
