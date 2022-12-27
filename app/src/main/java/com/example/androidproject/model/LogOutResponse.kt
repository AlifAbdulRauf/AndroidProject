package com.example.androidproject.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class LogOutResponse {
    @SerializedName("message")
    @Expose
    var message: String? = null
}