package com.sati.plantnet.rest.base

import com.sati.plantnet.rest.service.IPhotoAPIService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitFactory {


    val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.plant.id/")
        .build()
        .create(IPhotoAPIService::class.java)

}
