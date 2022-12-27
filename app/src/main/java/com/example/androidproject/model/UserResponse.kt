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

    @SerializedName("user")
    @Expose
    var identitas: Identitas? = null

    @SerializedName("authorisation")
    @Expose
    var authorisation: User? = null

    class Identitas{
        @SerializedName("username")
        @Expose
        var username: String? = null

        @SerializedName("name")
        @Expose
        var name: String? = null

        @SerializedName("email")
        @Expose
        var email: String? = null
    }


    class User{
        @SerializedName("token")
        @Expose
        var token: String? = null

        @SerializedName("type")
        @Expose
        var type: String? = null
    }
}