package com.example.androidproject.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ChangePassResponde {

    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("message")
    @Expose
    var message: String? = null

}