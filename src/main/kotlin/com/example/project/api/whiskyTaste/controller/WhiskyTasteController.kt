package com.example.project.api.whiskyTaste.controller

import com.example.project.api.whisky.response.WhiskyTasteResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping


@RequestMapping("api/v1")
interface WhiskyTasteController {
  @GetMapping("/whiskyTastes")
  fun getWhiskyTastes(): ResponseEntity<WhiskyTasteResponse>
}