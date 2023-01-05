package com.example.androidproject.model

import com.google.gson.annotations.SerializedName

data class ListProfilRes(

    @field:SerializedName("theses")
    val theses: List<ThesesItem>
)

data class ThesesItem(

    @field:SerializedName("student")
    val student: Student? = null,
)

data class Student(

    @field:SerializedName("nim")
    val nim: String? = null,

    @field:SerializedName("name")
    val name: String? = null,
)
