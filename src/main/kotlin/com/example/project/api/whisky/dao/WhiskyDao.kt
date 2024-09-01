package com.example.project.api.whisky.dao

import com.example.project.common.domain.Whisky
import org.seasar.doma.Dao
import org.seasar.doma.Select
import org.seasar.doma.boot.ConfigAutowireable

@Dao
@ConfigAutowireable
interface WhiskyDao {
  @Select
  fun listWhiskies(): List<Whisky>
}