package com.example.project.api.whisky.controller.impl

import com.example.project.api.whisky.controller.WhiskyController
import com.example.project.api.whisky.response.WhiskyResponse
import com.example.project.api.whiskyTaste.controller.WhiskyTasteController
import com.example.project.api.whisky.response.WhiskyTasteResponse
import com.example.project.api.whisky.usecase.WhiskyUseCase
import com.example.project.api.whiskyTaste.usecase.WhiskyTasteUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class WhiskyControllerImpl(
  private val whiskyUseCase: WhiskyUseCase
) : WhiskyController {
  override fun getWhiskies(): ResponseEntity<WhiskyResponse> {
    val output = whiskyUseCase.getWhiskies()
    return ResponseEntity.ok(output)
  }
}