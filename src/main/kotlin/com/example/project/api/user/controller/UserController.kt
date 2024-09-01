package com.example.project.api.user.controller

import com.example.project.api.user.response.UserResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("api/v1")
interface UserController {
  @GetMapping("/users")
  fun getUsers(): ResponseEntity<UserResponse>
}