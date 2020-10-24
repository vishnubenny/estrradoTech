package com.vishnu.core.home.api

import kotlinx.coroutines.flow.Flow

interface HomeFetcher {

    suspend fun getHomeContent(): Flow<ApiHomeContent>
}
