package com.example.project.api.user.usecase.impl

import com.example.project.api.user.dao.UserDao
import com.example.project.api.user.dto.UserResponseDto
import com.example.project.api.user.response.UserResponse
import com.example.project.api.user.usecase.UserUseCase
import org.springframework.stereotype.Service

@Service
class UserUseCaseImpl(
  private val userDao: UserDao
) : UserUseCase {
  override fun getUsers(): UserResponse {
    val users = userDao.listUser()
    val userResponseDtos = users.map {
      UserResponseDto(
        userId = it.userId,
        email = it.email,
        password = it.password,
        name = it.name,
        roleType = it.roleType,
      )
    }
    return UserResponse(
      response = userResponseDtos
    )
  }
}