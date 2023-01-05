package com.example.example

import com.google.gson.annotations.SerializedName


data class Pivot (

  @SerializedName("thesis_id"   ) var thesisId   : Int?    = null,
  @SerializedName("lecturer_id" ) var lecturerId : Int?    = null,
  @SerializedName("id"          ) var id         : Int?    = null,
  @SerializedName("position"    ) var position   : Int?    = null,
  @SerializedName("status"      ) var status     : Int?    = null,
  @SerializedName("created_by"  ) var createdBy  : Int?    = null,
  @SerializedName("created_at"  ) var createdAt  : String? = null,
  @SerializedName("updated_at"  ) var updatedAt  : String? = null

)