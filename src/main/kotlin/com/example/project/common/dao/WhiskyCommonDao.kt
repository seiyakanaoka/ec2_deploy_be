package com.example.project.common.dao

import com.example.project.common.domain.Whisky
import org.seasar.doma.Dao
import org.seasar.doma.Select
import org.seasar.doma.boot.ConfigAutowireable

@Dao
@ConfigAutowireable
interface WhiskyCommonDao {
  @Select
  fun selectByPrimaryKey(whiskyId: String): Whisky?

  @Select
  fun listByPrimaryKey(whiskyIds: List<String>): List<Whisky>
}