package com.example.mvvmapp.domain.network.model

data class ApiObjectResponse(
    val postId: Int,
    val id: Int,
    val name: String,
    val email: String,
    val body: String,
)
