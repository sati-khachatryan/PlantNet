package com.sati.plantnet

import com.google.gson.annotations.SerializedName

data class ImagesUploadResponse (
    @SerializedName("suggestions") val suggestions : List<Suggestions>){
    data class Suggestions (
        @SerializedName("id") val id : Int,
        @SerializedName("plant_name") val plant_name : String,
        @SerializedName("probability") val probability : Double,
        @SerializedName("confirmed") val confirmed : Boolean
    )
}





