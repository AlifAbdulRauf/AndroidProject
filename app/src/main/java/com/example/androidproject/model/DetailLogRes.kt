package com.example.androidproject.model

import com.google.gson.annotations.SerializedName

data class DetailLogRes(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("thesis_id")
	val thesisId: Int? = null,

	@field:SerializedName("notes")
	val notes: Any? = null,

	@field:SerializedName("supervisor_id")
	val supervisorId: Int? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("supervised_at")
	val supervisedAt: Any? = null,

	@field:SerializedName("file_progress")
	val fileProgress: Any? = null,

	@field:SerializedName("supervised_by")
	val supervisedBy: Any? = null,

	@field:SerializedName("problem")
	val problem: Any? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("progress")
	val progress: String? = null,

	@field:SerializedName("file_notes")
	val fileNotes: Any? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("status")
	val status: Int? = null
)
