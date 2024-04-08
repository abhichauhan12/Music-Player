package com.abhishek.musicapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.abhishek.musicapp.databinding.ActivityMainBindingImpl;
import com.abhishek.musicapp.databinding.FragmentAudioThumbnailBindingImpl;
import com.abhishek.musicapp.databinding.FragmentForYouBindingImpl;
import com.abhishek.musicapp.databinding.FragmentHomeBindingImpl;
import com.abhishek.musicapp.databinding.FragmentMiniPlayerBindingImpl;
import com.abhishek.musicapp.databinding.FragmentSongBindingImpl;
import com.abhishek.musicapp.databinding.FragmentTopTracksBindingImpl;
import com.abhishek.musicapp.databinding.MusicListItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTAUDIOTHUMBNAIL = 2;

  private static final int LAYOUT_FRAGMENTFORYOU = 3;

  private static final int LAYOUT_FRAGMENTHOME = 4;

  private static final int LAYOUT_FRAGMENTMINIPLAYER = 5;

  private static final int LAYOUT_FRAGMENTSONG = 6;

  private static final int LAYOUT_FRAGMENTTOPTRACKS = 7;

  private static final int LAYOUT_MUSICLISTITEM = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.abhishek.musicapp.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.abhishek.musicapp.R.layout.fragment_audio_thumbnail, LAYOUT_FRAGMENTAUDIOTHUMBNAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.abhishek.musicapp.R.layout.fragment_for_you, LAYOUT_FRAGMENTFORYOU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.abhishek.musicapp.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.abhishek.musicapp.R.layout.fragment_mini_player, LAYOUT_FRAGMENTMINIPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.abhishek.musicapp.R.layout.fragment_song, LAYOUT_FRAGMENTSONG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.abhishek.musicapp.R.layout.fragment_top_tracks, LAYOUT_FRAGMENTTOPTRACKS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.abhishek.musicapp.R.layout.music_list_item, LAYOUT_MUSICLISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTAUDIOTHUMBNAIL: {
          if ("layout/fragment_audio_thumbnail_0".equals(tag)) {
            return new FragmentAudioThumbnailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_audio_thumbnail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFORYOU: {
          if ("layout/fragment_for_you_0".equals(tag)) {
            return new FragmentForYouBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_for_you is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMINIPLAYER: {
          if ("layout/fragment_mini_player_0".equals(tag)) {
            return new FragmentMiniPlayerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_mini_player is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSONG: {
          if ("layout/fragment_song_0".equals(tag)) {
            return new FragmentSongBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_song is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTOPTRACKS: {
          if ("layout/fragment_top_tracks_0".equals(tag)) {
            return new FragmentTopTracksBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_top_tracks is invalid. Received: " + tag);
        }
        case  LAYOUT_MUSICLISTITEM: {
          if ("layout/music_list_item_0".equals(tag)) {
            return new MusicListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for music_list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_main_0", com.abhishek.musicapp.R.layout.activity_main);
      sKeys.put("layout/fragment_audio_thumbnail_0", com.abhishek.musicapp.R.layout.fragment_audio_thumbnail);
      sKeys.put("layout/fragment_for_you_0", com.abhishek.musicapp.R.layout.fragment_for_you);
      sKeys.put("layout/fragment_home_0", com.abhishek.musicapp.R.layout.fragment_home);
      sKeys.put("layout/fragment_mini_player_0", com.abhishek.musicapp.R.layout.fragment_mini_player);
      sKeys.put("layout/fragment_song_0", com.abhishek.musicapp.R.layout.fragment_song);
      sKeys.put("layout/fragment_top_tracks_0", com.abhishek.musicapp.R.layout.fragment_top_tracks);
      sKeys.put("layout/music_list_item_0", com.abhishek.musicapp.R.layout.music_list_item);
    }
  }
}
