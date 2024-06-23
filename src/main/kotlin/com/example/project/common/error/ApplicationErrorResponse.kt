package com.example.project.common.error

data class ApplicationErrorResponse(
    val message: String = "",
    val httpStatus: Int,
    val httpMethod: String,
    val fieldErrors: List<FieldError?> = listOf<FieldError>()
)