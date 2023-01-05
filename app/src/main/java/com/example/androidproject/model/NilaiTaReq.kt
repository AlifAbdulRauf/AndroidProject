package com.example.androidproject.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class NilaiTaReq {
    @SerializedName("grade")
    @Expose
    var grade: String? = null
}