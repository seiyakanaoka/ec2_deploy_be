package com.example.project.common.domain

import org.seasar.doma.Column
import org.seasar.doma.Entity

@Entity(immutable = true)
data class Whisky(
  @Column(name = "whisky_id")
  val whiskyId: String,
  @Column(name = "name")
  val name: String
)
