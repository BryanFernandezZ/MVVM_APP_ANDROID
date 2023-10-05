package com.example.mvvmapp.domain

import com.example.mvvmapp.domain.network.ApiService
import com.example.mvvmapp.domain.network.model.ApiObjectResponse

class ApiRepository {

    private val apiService = ApiService()

    suspend fun getComments(): List<ApiObjectResponse> {
        return apiService.getComments()
    }
}