package com.example.mvvmapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmapp.domain.ApiRepository
import com.example.mvvmapp.domain.network.model.ApiObjectResponse
import kotlinx.coroutines.launch

class ApiViewModel : ViewModel() {

    private val apiRepository = ApiRepository()
    private val _response = MutableLiveData<List<ApiObjectResponse>>()
    val response: LiveData<List<ApiObjectResponse>>
        get() = _response

    fun getComments() {
        viewModelScope.launch {
            val result = apiRepository.getComments()
            _response.postValue(result)
        }
    }
}