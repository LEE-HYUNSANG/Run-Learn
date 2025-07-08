package com.runlearn.ai.data.remote

import retrofit2.http.GET

interface RetrofitService {
    @GET("profile")
    suspend fun getProfile(): String
}
