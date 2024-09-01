package com.example.project.common.domain

import org.seasar.doma.Column
import org.seasar.doma.Entity

@Entity(immutable = true)
data class WhiskyTaste(
  @Column(name = "whisky_taste_id")
  val whiskyTasteId: String,
  @Column(name = "whisky_id")
  val whiskyId: String,
  @Column(name = "sweet")
  val sweet: Int,
  @Column(name = "vanilla_flavor")
  val vanillaFlavor: Int,
  @Column(name = "smokey")
  val smokey: Int,
  @Column(name = "spicy")
  val spicy: Int,
  @Column(name = "strong")
  val strong: Int,
)
