package com.example.project.api.whiskyTaste.usecase

import com.example.project.api.whisky.response.WhiskyTasteResponse

interface WhiskyTasteUseCase {
  fun getWhiskyTastes(): WhiskyTasteResponse
}