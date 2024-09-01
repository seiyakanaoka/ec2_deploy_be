package com.example.project.common.domain

import org.seasar.doma.Column
import org.seasar.doma.Entity

@Entity(immutable = true)
data class User(
  @Column(name = "user_id")
  val userId: String,
  @Column(name = "email")
  val email: String,
  @Column(name = "password")
  val password: String,
  @Column(name = "name")
  val name: String,
  @Column(name = "role_type")
  val roleType: String,
)
