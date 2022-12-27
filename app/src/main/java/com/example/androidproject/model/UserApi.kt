package com.example.androidproject.model

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.PUT

interface UserApi {
    @POST("login")
    fun login(
        @Body userRequest: UserRequest
    ): Call<UserResponse >

    @POST("password")
    fun update(
        @Header("Authorization") token:String?,
        @Body changePassReq: ChangePassReq
    ): Call<ChangePassResponde>

    @POST("logout")
    fun logout(
        @Header("Authorization") token:String?,
    ): Call<LogOutResponse>
}