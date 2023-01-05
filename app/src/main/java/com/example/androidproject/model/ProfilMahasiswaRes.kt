package com.example.androidproject.model

import com.google.gson.annotations.SerializedName

data class ProfilMahasiswaRes(

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
	val examiners: List<ExaminersItem?>? = null,

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

