package com.vishnu.core.home

import com.vishnu.core.home.api.ApiHomeContent
import com.vishnu.core.home.api.HomeBackend
import com.vishnu.core.home.api.HomeFetcher
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import okhttp3.MultipartBody
import okhttp3.RequestBody

class HomeApiFetcher(private val backend: HomeBackend) : HomeFetcher {

    override suspend fun getHomeContent(): Flow<ApiHomeContent> {
        return flow { emit(backend.getHomeContent(getRequestBody()).await()) }
            .flowOn(IO)
    }

    private fun getRequestBody(): RequestBody {
        return MultipartBody.Builder()
            .setType(MultipartBody.FORM)
            .addFormDataPart("access_token", "752027")
            .addFormDataPart("country_code", "AE")
            .build()
    }
}
