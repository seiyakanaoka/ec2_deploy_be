package com.example.project.api.payment.usecase

import com.example.project.api.payment.usecase.dto.PostPaymentDto
import com.example.project.common.response.payment.GetPaymentsResponse
import com.example.project.common.response.payment.PostPaymentResponse

interface PaymentUseCase {
  fun getPayments(): GetPaymentsResponse

  fun createPayment(postPaymentDto: PostPaymentDto): PostPaymentResponse
}