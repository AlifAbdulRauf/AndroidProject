package com.example.example

import com.google.gson.annotations.SerializedName


data class Trials (

  @SerializedName("id"               ) var id             : Int?    = null,
  @SerializedName("thesis_id"        ) var thesisId       : Int?    = null,
  @SerializedName("thesis_rubric_id" ) var thesisRubricId : Int?    = null,
  @SerializedName("file_report"      ) var fileReport     : String? = null,
  @SerializedName("file_slide"       ) var fileSlide      : String? = null,
  @SerializedName("file_journal"     ) var fileJournal    : String? = null,
  @SerializedName("status"           ) var status         : Int?    = null,
  @SerializedName("registered_at"    ) var registeredAt   : String? = null,
  @SerializedName("method"           ) var method         : Int?    = null,
  @SerializedName("trial_at"         ) var trialAt        : String? = null,
  @SerializedName("start_at"         ) var startAt        : String? = null,
  @SerializedName("end_at"           ) var endAt          : String? = null,
  @SerializedName("room_id"          ) var roomId         : String? = null,
  @SerializedName("online_url"       ) var onlineUrl      : String? = null,
  @SerializedName("score"            ) var score          : String? = null,
  @SerializedName("grade"            ) var grade          : String? = null,
  @SerializedName("description"      ) var description    : String? = null,
  @SerializedName("created_at"       ) var createdAt      : String? = null,
  @SerializedName("updated_at"       ) var updatedAt      : String? = null

)