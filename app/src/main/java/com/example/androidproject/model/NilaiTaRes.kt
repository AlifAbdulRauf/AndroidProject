package com.example.androidproject.model

import com.google.gson.annotations.SerializedName

data class NilaiTaRes(

    @field:SerializedName("message")
    val message: String? = null,

    @field:SerializedName("status")
    val status: String? = null
)
