package com.example.example

import com.google.gson.annotations.SerializedName


data class DetailTAResponse (

  @SerializedName("id"          ) var id          : Int?                   = null,
  @SerializedName("topic_id"    ) var topicId     : Int?                   = null,
  @SerializedName("student_id"  ) var studentId   : Int?                   = null,
  @SerializedName("title"       ) var title       : String?                = null,
  @SerializedName("abstract"    ) var abstract    : String?                = null,
  @SerializedName("start_at"    ) var startAt     : String?                = null,
  @SerializedName("status"      ) var status      : Int?                   = null,
  @SerializedName("grade"       ) var grade       : String?                = null,
  @SerializedName("grade_by"    ) var gradeBy     : Int?                   = null,
  @SerializedName("created_by"  ) var createdBy   : Int?                   = null,
  @SerializedName("created_at"  ) var createdAt   : String?                = null,
  @SerializedName("updated_at"  ) var updatedAt   : String?                = null,
  @SerializedName("student"     ) var student     : Student?               = Student(),
  @SerializedName("seminars"    ) var seminars    : ArrayList<Seminars>    = arrayListOf(),
  @SerializedName("trials"      ) var trials      : ArrayList<Trials>      = arrayListOf(),
  @SerializedName("supervisors" ) var supervisors : ArrayList<Supervisors> = arrayListOf()

)