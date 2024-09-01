package com.example.project.api.whisky.controller

import com.example.project.api.whisky.response.WhiskyResponse
import com.example.project.api.whisky.response.WhiskyTasteResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("api/v1")
interface WhiskyController {
  @GetMapping("/whiskies")
  fun getWhiskies(): ResponseEntity<WhiskyResponse>
}