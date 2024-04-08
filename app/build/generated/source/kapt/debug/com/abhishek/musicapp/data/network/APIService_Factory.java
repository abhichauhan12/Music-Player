// Generated by Dagger (https://dagger.dev).
package com.abhishek.musicapp.data.network;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class APIService_Factory implements Factory<APIService> {
  private final Provider<Retrofit> retrofitProvider;

  public APIService_Factory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public APIService get() {
    return newInstance(retrofitProvider.get());
  }

  public static APIService_Factory create(Provider<Retrofit> retrofitProvider) {
    return new APIService_Factory(retrofitProvider);
  }

  public static APIService newInstance(Retrofit retrofit) {
    return new APIService(retrofit);
  }
}