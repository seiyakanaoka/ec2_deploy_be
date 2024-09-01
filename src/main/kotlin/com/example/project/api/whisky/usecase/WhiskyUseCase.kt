package com.example.project.api.whisky.usecase

import com.example.project.api.whisky.response.WhiskyResponse
import com.example.project.api.whisky.response.WhiskyTasteResponse

interface WhiskyUseCase {
  fun getWhiskies(): WhiskyResponse
}