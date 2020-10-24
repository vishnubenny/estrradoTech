package com.vishnu.estradotext.home.di

import com.vishnu.core.home.HomeApiFetcher
import com.vishnu.core.home.api.HomeBackend
import com.vishnu.estradotext.home.HomeRepository
import com.vishnu.estradotext.home.HomeViewModel
import com.vishnu.estradotext.home.adapter.HomeContentAdapter
import com.vishnu.estradotext.home.viewstate.HomeContentViewStateConverter
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val homeModule = module {
    factory { provideHomeBackend(get()) }
    factory { HomeApiFetcher(get()) }
    factory { HomeContentViewStateConverter() }
    factory { HomeRepository(get(), get()) }
    factory { HomeContentAdapter() }
    viewModel { HomeViewModel(get(), get()) }
}

private fun provideHomeBackend(builder: Retrofit.Builder): HomeBackend {
    return builder.baseUrl("https://vinshopify.com/")
        .build()
        .create(HomeBackend::class.java)
}
