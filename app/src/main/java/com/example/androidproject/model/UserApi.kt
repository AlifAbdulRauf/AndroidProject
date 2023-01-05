package com.example.androidproject.model

import com.example.example.DetailTAResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

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

    @GET("api/theses/309")
    fun detailTA(
        @Header("Authorization") token:String?,
    ): Call<DetailTAResponse>
}