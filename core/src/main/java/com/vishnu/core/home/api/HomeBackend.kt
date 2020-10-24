package com.vishnu.core.home.api

import kotlinx.coroutines.Deferred
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.POST

interface HomeBackend {

    @POST("uat/api/home")
    fun getHomeContent(@Body body: RequestBody): Deferred<ApiHomeContent>
}
