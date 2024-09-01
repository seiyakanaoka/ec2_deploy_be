package com.example.project.api.user.usecase

import com.example.project.api.user.dto.UserResponseDto
import com.example.project.api.user.response.UserResponse

interface UserUseCase {
  fun getUsers(): UserResponse
}