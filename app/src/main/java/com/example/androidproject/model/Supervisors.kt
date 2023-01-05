package com.example.example

import com.google.gson.annotations.SerializedName


data class Supervisors (

  @SerializedName("id"               ) var id              : Int?    = null,
  @SerializedName("nik"              ) var nik             : String? = null,
  @SerializedName("name"             ) var name            : String? = null,
  @SerializedName("nip"              ) var nip             : String? = null,
  @SerializedName("nidn"             ) var nidn            : String? = null,
  @SerializedName("karpeg"           ) var karpeg          : String? = null,
  @SerializedName("npwp"             ) var npwp            : String? = null,
  @SerializedName("gender"           ) var gender          : Int?    = null,
  @SerializedName("birthday"         ) var birthday        : String? = null,
  @SerializedName("birthplace"       ) var birthplace      : String? = null,
  @SerializedName("phone"            ) var phone           : String? = null,
  @SerializedName("address"          ) var address         : String? = null,
  @SerializedName("department_id"    ) var departmentId    : Int?    = null,
  @SerializedName("photo"            ) var photo           : String? = null,
  @SerializedName("marital_status"   ) var maritalStatus   : Int?    = null,
  @SerializedName("religion"         ) var religion        : Int?    = null,
  @SerializedName("association_type" ) var associationType : String? = null,
  @SerializedName("status"           ) var status          : Int?    = null,
  @SerializedName("created_at"       ) var createdAt       : String? = null,
  @SerializedName("updated_at"       ) var updatedAt       : String? = null,
  @SerializedName("pivot"            ) var pivot           : Pivot?  = Pivot()

)