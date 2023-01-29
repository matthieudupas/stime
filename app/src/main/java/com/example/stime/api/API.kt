package com.example.stime.api

interface API {
    @GET("api_endpoint")
    suspend fun getData(): Response<YourDataClass>
}