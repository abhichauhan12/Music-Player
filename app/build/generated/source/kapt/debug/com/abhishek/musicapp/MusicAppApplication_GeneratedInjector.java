package com.abhishek.musicapp;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = MusicAppApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface MusicAppApplication_GeneratedInjector {
  void injectMusicAppApplication(MusicAppApplication musicAppApplication);
}
