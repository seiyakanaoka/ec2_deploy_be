package com.example.project.api.whisky.usecase.impl

import com.example.project.api.whisky.response.WhiskyTasteResponse
import com.example.project.api.whiskyTaste.usecase.WhiskyTasteUseCase
import com.example.project.api.whiskyTaste.dao.WhiskyTasteDao
import com.example.project.api.whisky.dto.WhiskyTasteResponseDto
import org.springframework.stereotype.Service

@Service
class WhiskyTasteUseCaseImpl(
  private val whiskyTasteDao: WhiskyTasteDao
) : WhiskyTasteUseCase {
  override fun getWhiskyTastes(): WhiskyTasteResponse {
    val whiskies = whiskyTasteDao.listWhiskyTastes()
    val whiskyTasteResponseDtoList = whiskies.map {
      WhiskyTasteResponseDto(
        whiskyTasteId =it.whiskyTasteId,
        whiskyId = it.whiskyId,
        sweet = it.sweet,
        vanillaFlavor = it.vanillaFlavor,
        smokey = it.smokey,
        spicy = it.spicy,
        strong = it.strong,
      )
    }
    return WhiskyTasteResponse(
      response = whiskyTasteResponseDtoList
    )
  }
}