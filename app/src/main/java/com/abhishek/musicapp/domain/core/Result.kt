package com.abhishek.musicapp.domain.core

import com.abhishek.musicapp.data.network.FetchStatus

data class Result<T>(val status : FetchStatus, val data: T?)