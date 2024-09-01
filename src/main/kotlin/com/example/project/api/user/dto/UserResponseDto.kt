package com.example.project.api.user.dto

data class UserResponseDto(
  val userId: String,
  val email: String,
  val password: String,
  val name: String,
  val roleType: String,
)