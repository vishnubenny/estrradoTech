package com.vishnu.estradotext.home

import com.vishnu.core.home.HomeApiFetcher
import com.vishnu.estradotext.home.viewstate.HomeContentViewState
import com.vishnu.estradotext.home.viewstate.HomeContentViewStateConverter
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart

@Suppress("EXPERIMENTAL_API_USAGE")
class HomeRepository(
    private val fetcher: HomeApiFetcher,
    private val converter: HomeContentViewStateConverter
) {

    suspend fun getHomeContent(): Flow<HomeContentViewState> {
        return fetcher.getHomeContent()
            .map { converter.apply(it) }
            .onStart { emit(HomeContentViewState.Loading) }
            .catch { emit(HomeContentViewState.Error) }
    }
}
