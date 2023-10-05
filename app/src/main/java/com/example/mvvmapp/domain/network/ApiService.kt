package com.example.mvvmapp.domain.network

import com.example.mvvmapp.core.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit

class ApiService {

    private val retrofit: Retrofit = RetrofitHelper.getRetrofit()

    suspend fun getComments() = withContext(Dispatchers.IO) {
        val response = retrofit.create(ApiClient::class.java).getComments()
        response.body() ?: emptyList()
    }
}