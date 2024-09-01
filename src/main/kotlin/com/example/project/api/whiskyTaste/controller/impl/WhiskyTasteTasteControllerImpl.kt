package com.example.project.api.whiskyTaste.controller.impl

import com.example.project.api.whiskyTaste.controller.WhiskyTasteController
import com.example.project.api.whisky.response.WhiskyTasteResponse
import com.example.project.api.whiskyTaste.usecase.WhiskyTasteUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class WhiskyTasteTasteControllerImpl(
  private val whiskyTasteUseCase: WhiskyTasteUseCase
) : WhiskyTasteController {
  override fun getWhiskyTastes(): ResponseEntity<WhiskyTasteResponse> {
    val output = whiskyTasteUseCase.getWhiskyTastes()
    return ResponseEntity.ok(output)
  }
}