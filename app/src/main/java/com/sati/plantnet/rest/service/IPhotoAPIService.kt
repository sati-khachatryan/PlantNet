package com.sati.plantnet

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface IPhotoAPIService {
    @POST("v2/identify")
//    @Header("application-Key",SHA256:+u5FtdhSo4Ey5NyKyoxrukafFhbF9fr4gdYRgJrdAY)
    fun requestImageList(@Body body: ImagesUploadRequest): Response<List<ImagesUploadResponse>>

}