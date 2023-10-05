package com.example.mvvmapp

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmapp.databinding.ActivityMainBinding
import com.example.mvvmapp.ui.ApiViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val apiViewModel: ApiViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
    }

    private fun initUI() {
        apiViewModel.response.observe(this) {
            Log.d("API_RESPONSE", it.toString())
        }

        apiViewModel.getComments()
    }
}