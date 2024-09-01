package com.example.project.api.user.controller.impl

import com.example.project.api.user.controller.UserController
import com.example.project.api.user.response.UserResponse
import com.example.project.api.user.usecase.UserUseCase
import lombok.RequiredArgsConstructor
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
class UserControllerImpl(
  private val userUseCase: UserUseCase
) : UserController {
  override fun getUsers(): ResponseEntity<UserResponse> {
    val output = userUseCase.getUsers()
    return ResponseEntity.ok(output)
  }
}