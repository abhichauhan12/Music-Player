package com.abhishek.musicapp.di

import com.abhishek.musicapp.data.network.APIService
import com.abhishek.musicapp.data.network.apis.SongsAPI
import com.abhishek.musicapp.utils.BASE_URL
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .build()
    }

    @Provides
    fun provideAPIService(retrofit: Retrofit) : APIService {
        return APIService(retrofit = retrofit)
    }

    @Provides
    fun provideSongsAPI(apiService: APIService) : SongsAPI {
        return apiService.createAPI(SongsAPI::class.java)
    }
}