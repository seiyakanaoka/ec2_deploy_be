package com.example.project.api.payment.usecase.impl

import com.example.project.api.payment.usecase.PaymentUseCase
import com.example.project.api.payment.usecase.dto.PostPaymentDto
import com.example.project.common.response.payment.Payment
import com.example.project.common.response.payment.GetPaymentsResponse
import com.example.project.common.response.payment.PostPaymentResponse
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.UUID

@Service
class PaymentUseCaseImpl : PaymentUseCase {
  override fun getPayments(): GetPaymentsResponse {
    val payments = (1..30).map {
      Payment(
        paymentId = "P000000000$it",
        totalPayment = "${it}000".toInt(),
        paymentDate = LocalDateTime.now(),
      )
    }
    return GetPaymentsResponse(payments = payments)
  }

  override fun createPayment(postPaymentDto: PostPaymentDto): PostPaymentResponse {
    return PostPaymentResponse(paymentId = UUID.randomUUID().toString())
  }
}