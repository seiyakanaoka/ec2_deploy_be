package com.example.project.common.dao

import com.example.project.common.domain.WhiskyTaste
import org.seasar.doma.Dao
import org.seasar.doma.Select
import org.seasar.doma.boot.ConfigAutowireable

@Dao
@ConfigAutowireable
interface WhiskyTasteCommonDao {
  @Select
  fun selectByPrimaryKey(whiskyTasteId: String): WhiskyTaste?

  @Select
  fun listByPrimaryKey(whiskyTasteIds: List<String>): List<WhiskyTaste>
}