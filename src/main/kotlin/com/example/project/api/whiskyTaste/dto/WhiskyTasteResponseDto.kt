package com.example.project.api.whisky.dto

import org.seasar.doma.Column

data class WhiskyTasteResponseDto(
  val whiskyTasteId: String,
  val whiskyId: String,
  val sweet: Int,
  val vanillaFlavor: Int,
  val smokey: Int,
  val spicy: Int,
  val strong: Int,
)
