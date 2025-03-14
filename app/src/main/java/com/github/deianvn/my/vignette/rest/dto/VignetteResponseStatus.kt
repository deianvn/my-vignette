package com.github.deianvn.my.vignette.rest.dto

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VignetteResponseStatus(
    val code: Int,
    val message: String
)
