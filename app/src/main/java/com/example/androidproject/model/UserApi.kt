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

    @GET("thesis/advisors")
    fun getAdvisors(
        @Header("Authorization") token:String?,
    ): Call<ListProfilRes>

    @PATCH("/thesis/grades/277")
    fun nilaiTa(
        @Header("Authorization") token:String?,
        @Body nilaiTaReq: NilaiTaReq
    ): Call<NilaiTaRes>

    @GET("theses/277/trials/")
    fun profilMahasiswa(
        @Header("Authorization") token:String?,
    ): Call<ProfilMahasiswaRes>

    @GET("theses/309/logbooks")
    fun listLog(
        @Header("Authorization") token:String?,
    ): Call<Response>

    }

