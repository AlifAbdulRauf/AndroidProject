package com.example.androidproject.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserResponse {

//    @SerializedName("data")
//    @Expose
//    var data: User? = null

    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("authorisation")
    @Expose
    var authorisation: User? = null

    class User{
        @SerializedName("token")
        @Expose
        var token: String? = null

        @SerializedName("type")
        @Expose
        var type: String? = null
    }
}