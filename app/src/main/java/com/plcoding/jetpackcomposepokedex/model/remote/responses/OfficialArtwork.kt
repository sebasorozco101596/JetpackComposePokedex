package com.plcoding.jetpackcomposepokedex.model.remote.responses


import com.google.gson.annotations.SerializedName

data class OfficialArtwork(
    @SerializedName("front_default")
    val frontDefault: String
)