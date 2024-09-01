package com.example.project.api.whisky.response

import com.example.project.api.whisky.dto.WhiskyResponseDto
import com.example.project.api.whisky.dto.WhiskyTasteResponseDto

data class WhiskyResponse(
  val response: List<WhiskyResponseDto>
)
