package com.example.project.api.whisky.usecase.impl

import com.example.project.api.whisky.dao.WhiskyDao
import com.example.project.api.whisky.dto.WhiskyResponseDto
import com.example.project.api.whisky.response.WhiskyTasteResponse
import com.example.project.api.whiskyTaste.usecase.WhiskyTasteUseCase
import com.example.project.api.whiskyTaste.dao.WhiskyTasteDao
import com.example.project.api.whisky.dto.WhiskyTasteResponseDto
import com.example.project.api.whisky.response.WhiskyResponse
import com.example.project.api.whisky.usecase.WhiskyUseCase
import org.springframework.stereotype.Service

@Service
class WhiskyUseCaseImpl(
  private val whiskyDao: WhiskyDao
) : WhiskyUseCase {
  override fun getWhiskies(): WhiskyResponse {
    val whiskies = whiskyDao.listWhiskies()
    val whiskyResponseDtoList = whiskies.map {
      WhiskyResponseDto(
        whiskyId = it.whiskyId,
        name = it.name
      )
    }
    return WhiskyResponse(
      response = whiskyResponseDtoList
    )
  }
}