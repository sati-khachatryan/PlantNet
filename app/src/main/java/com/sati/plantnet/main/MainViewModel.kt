package com.sati.plantnet.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sati.plantnet.rest.service.IPhotoAPIService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainViewModel : ViewModel() {


    fun uploadImages(images: List<String>) {
        viewModelScope.launch(Dispatchers.IO) {

        }
    }
}