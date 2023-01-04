package com.example.androidproject.model

import retrofit2.Call
import retrofit2.http.*

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

    @GET("theses/309/logbooks")
    fun listLog(
        @Header("Authorization") token:String?,
    ): Call<Response>

    @GET("theses/200/logbooks/{id}")
    fun detailLog(
        @Path(value = "id", encoded = false) key: Int,
        @Header("Authorization") token:String?
    ): Call<DetailLogRes>

    @GET("theses/14/trials")
    fun detaiSidang(
        @Header("Authorization") token:String?
    ): Call<DetailSidangRes>

//    @GET("theses/14/trials")
//    fun detaiSidang2(
//        @Header("Authorization") token:String?
//    ): Call<ExaminersItem>
}