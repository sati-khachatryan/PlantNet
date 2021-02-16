package com.sati.plantnet.rest.service

import com.sati.plantnet.ImagesUploadRequest
import com.sati.plantnet.ImagesUploadResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface IPhotoAPIService {
    @POST("v2/identify")
    fun requestImageList(@Body body: ImagesUploadRequest): Response<List<ImagesUploadResponse>>

}