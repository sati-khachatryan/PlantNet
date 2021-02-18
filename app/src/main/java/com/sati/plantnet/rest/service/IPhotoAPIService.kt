package com.sati.plantnet.rest.service

import com.sati.plantnet.ImagesUploadRequest
import com.sati.plantnet.ImagesUploadResponse
import retrofit2.Call
import retrofit2.http.*

interface IPhotoAPIService {
    @POST("images")
//    @Headers("Api_Key : T6Wenutxq2JsnfHZHa2okhs0tYuAiM2pc0rOnBfTyl9pinihOo")
//    @Headers({"Api_Key :  T6Wenutxq2JsnfHZHa2okhs0tYuAiM2pc0rOnBfTyl9pinihOo"})
    fun requestImageList(@Body() images: List<String>): Call<ImagesUploadResponse>
}