package com.example.project.api.whiskyTaste.dao

import com.example.project.common.domain.WhiskyTaste
import org.seasar.doma.Dao
import org.seasar.doma.Select
import org.seasar.doma.boot.ConfigAutowireable

@Dao
@ConfigAutowireable
interface WhiskyTasteDao {
  @Select
  fun listWhiskyTastes(): List<WhiskyTaste>
}