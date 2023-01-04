package com.example.androidproject.model

import com.google.gson.annotations.SerializedName

data class DetailSidangRes(

	@field:SerializedName("room_id")
	val roomId: Any? = null,

	@field:SerializedName("end_at")
	val endAt: String? = null,

	@field:SerializedName("thesis_id")
	val thesisId: Int? = null,

	@field:SerializedName("file_slide")
	val fileSlide: String? = null,

	@field:SerializedName("registered_at")
	val registeredAt: String? = null,

	@field:SerializedName("method")
	val method: Int? = null,

	@field:SerializedName("examiners")
	val examiners: List<ExaminersItem>,

	@field:SerializedName("file_report")
	val fileReport: Any? = null,

	@field:SerializedName("description")
	val description: Any? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("thesis_rubric_id")
	val thesisRubricId: Int? = null,

	@field:SerializedName("start_at")
	val startAt: String? = null,

	@field:SerializedName("file_journal")
	val fileJournal: String? = null,

	@field:SerializedName("score")
	val score: Any? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("grade")
	val grade: String? = null,

	@field:SerializedName("trial_at")
	val trialAt: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("online_url")
	val onlineUrl: Any? = null,

	@field:SerializedName("status")
	val status: Int? = null
)

data class ExaminersItem(

	@field:SerializedName("birthday")
	val birthday: String? = null,

	@field:SerializedName("address")
	val address: Any? = null,

	@field:SerializedName("gender")
	val gender: Int? = null,

	@field:SerializedName("department_id")
	val departmentId: Int? = null,

	@field:SerializedName("npwp")
	val npwp: Any? = null,

	@field:SerializedName("photo")
	val photo: Any? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("association_type")
	val associationType: Int? = null,

	@field:SerializedName("religion")
	val religion: Int? = null,

	@field:SerializedName("nik")
	val nik: String? = null,

	@field:SerializedName("marital_status")
	val maritalStatus: Int? = null,

	@field:SerializedName("nip")
	val nip: String? = null,

	@field:SerializedName("karpeg")
	val karpeg: Any? = null,

	@field:SerializedName("birthplace")
	val birthplace: String? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("phone")
	val phone: String? = null,

	@field:SerializedName("nidn")
	val nidn: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("pivot")
	val pivot: Pivot? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("status")
	val status: Int? = null
)

data class Pivot(

	@field:SerializedName("examiner_id")
	val examinerId: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("position")
	val position: Int? = null,

	@field:SerializedName("thesis_trial_id")
	val thesisTrialId: Int? = null
)
