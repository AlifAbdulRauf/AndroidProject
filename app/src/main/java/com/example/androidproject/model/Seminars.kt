package com.example.example

import com.google.gson.annotations.SerializedName


data class Seminars (

  @SerializedName("id"              ) var id             : Int?    = null,
  @SerializedName("thesis_id"       ) var thesisId       : Int?    = null,
  @SerializedName("registered_at"   ) var registeredAt   : String? = null,
  @SerializedName("method"          ) var method         : Int?    = null,
  @SerializedName("seminar_at"      ) var seminarAt      : String? = null,
  @SerializedName("room_id"         ) var roomId         : Int?    = null,
  @SerializedName("online_url"      ) var onlineUrl      : String? = null,
  @SerializedName("file_report"     ) var fileReport     : String? = null,
  @SerializedName("file_slide"      ) var fileSlide      : String? = null,
  @SerializedName("file_journal"    ) var fileJournal    : String? = null,
  @SerializedName("file_attendance" ) var fileAttendance : String? = null,
  @SerializedName("recommendation"  ) var recommendation : String? = null,
  @SerializedName("status"          ) var status         : Int?    = null,
  @SerializedName("description"     ) var description    : String? = null,
  @SerializedName("created_at"      ) var createdAt      : String? = null,
  @SerializedName("updated_at"      ) var updatedAt      : String? = null

)