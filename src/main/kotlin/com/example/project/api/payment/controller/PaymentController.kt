package com.example.project.api.payment.controller

import com.example.project.common.request.payment.PostPaymentRequest
import com.example.project.common.response.payment.GetPaymentsResponse
import com.example.project.common.response.payment.PostPaymentResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("api/v1")
interface PaymentController {
  @GetMapping("/payments")
  fun getPayments(): ResponseEntity<GetPaymentsResponse>

  @PostMapping("/payment")
  fun postPayment(@RequestBody postPaymentRequest: PostPaymentRequest): ResponseEntity<PostPaymentResponse>
}