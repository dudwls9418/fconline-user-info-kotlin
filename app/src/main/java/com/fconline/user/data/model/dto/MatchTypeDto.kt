package com.fconline.user.data.model.dto

import com.google.gson.annotations.SerializedName

data class MatchTypeDto (
    @SerializedName("matchtype") val matchType: Int? = null, // 매치 종류
    @SerializedName("desc") val desc: String? = null // 매치 종류명
)