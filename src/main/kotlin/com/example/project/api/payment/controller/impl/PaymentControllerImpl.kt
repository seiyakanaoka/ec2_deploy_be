package com.example.project.api.payment.controller.impl

import com.example.project.api.payment.controller.PaymentController
import com.example.project.api.payment.usecase.PaymentUseCase
import com.example.project.api.payment.usecase.dto.PostPaymentDto
import com.example.project.common.request.payment.PostPaymentRequest
import com.example.project.common.response.payment.GetPaymentsResponse
import com.example.project.common.response.payment.PostPaymentResponse
import lombok.RequiredArgsConstructor
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
class PaymentControllerImpl(
  private val paymentUseCase: PaymentUseCase
) : PaymentController {
  override fun getPayments(): ResponseEntity<GetPaymentsResponse> {
    val output = paymentUseCase.getPayments()
    return ResponseEntity.ok(output)
  }

  override fun postPayment(postPaymentRequest: PostPaymentRequest): ResponseEntity<PostPaymentResponse> {
    val input = PostPaymentDto(input = postPaymentRequest)
    val output = paymentUseCase.createPayment(input)
    return ResponseEntity.ok(output)
  }
}