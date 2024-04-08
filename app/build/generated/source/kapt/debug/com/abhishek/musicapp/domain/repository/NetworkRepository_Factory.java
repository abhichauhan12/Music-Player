// Generated by Dagger (https://dagger.dev).
package com.abhishek.musicapp.domain.repository;

import com.abhishek.musicapp.data.network.apis.SongsAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NetworkRepository_Factory implements Factory<NetworkRepository> {
  private final Provider<SongsAPI> songsAPIProvider;

  public NetworkRepository_Factory(Provider<SongsAPI> songsAPIProvider) {
    this.songsAPIProvider = songsAPIProvider;
  }

  @Override
  public NetworkRepository get() {
    return newInstance(songsAPIProvider.get());
  }

  public static NetworkRepository_Factory create(Provider<SongsAPI> songsAPIProvider) {
    return new NetworkRepository_Factory(songsAPIProvider);
  }

  public static NetworkRepository newInstance(SongsAPI songsAPI) {
    return new NetworkRepository(songsAPI);
  }
}