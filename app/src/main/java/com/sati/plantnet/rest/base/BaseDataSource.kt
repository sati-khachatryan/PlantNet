package com.sati.plantnet.rest.base

import retrofit2.Response

open class BaseDataSource {
    suspend fun <T> getResult(func: () -> Response<T>): Response<T>? {

        val response = func()

        return if (response.isSuccessful) {
            response
        } else null
    }
}