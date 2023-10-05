package com.example.mvvmapp.domain.network

import com.example.mvvmapp.domain.network.model.ApiObjectResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient {

    @GET("comments")
    suspend fun getComments(): Response<List<ApiObjectResponse>>
}