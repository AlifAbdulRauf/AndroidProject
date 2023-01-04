package com.example.androidproject.model

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("count")
	val count: Int? = null,

	@field:SerializedName("logbooks")
	val logbooks: List<LogbooksItem>,

	@field:SerializedName("status")
	val status: String? = null
)

data class LogbooksItem(

	@field:SerializedName("progress")
	val progress: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("problem")
	val problem: String? = null
)
