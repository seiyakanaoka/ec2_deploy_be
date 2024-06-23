package com.example.project.common.response.payment

import java.time.LocalDateTime

data class Payment(
  val paymentId: String,
  val totalPayment: Int,
  val paymentDate: LocalDateTime,
)
