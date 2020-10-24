package com.vishnu.estradotext.di

import com.vishnu.estradotext.di.network.networkModule
import com.vishnu.estradotext.home.di.homeModule

val appModule = listOf(
    networkModule,
    homeModule
)
