// Generated by Dagger (https://dagger.dev).
package com.abhishek.musicapp.di;

import com.abhishek.musicapp.data.network.APIService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class NetworkModule_ProvideAPIServiceFactory implements Factory<APIService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideAPIServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public APIService get() {
    return provideAPIService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideAPIServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideAPIServiceFactory(retrofitProvider);
  }

  public static APIService provideAPIService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideAPIService(retrofit));
  }
}
