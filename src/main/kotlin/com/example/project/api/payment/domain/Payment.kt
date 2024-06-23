package com.example.project.api.payment.domain

data class Payment(
  val paymentId: String,
  val totalPayment: Int,
  val paymentDate: String,
)
