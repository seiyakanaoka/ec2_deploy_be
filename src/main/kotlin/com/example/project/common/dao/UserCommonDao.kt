package com.example.project.common.dao

import com.example.project.common.domain.User
import org.seasar.doma.Dao
import org.seasar.doma.Select
import org.seasar.doma.boot.ConfigAutowireable

@Dao
@ConfigAutowireable
interface UserCommonDao {
  @Select
  fun selectByPrimaryKey(userId: String): User?

  @Select
  fun listByPrimaryKey(userIds: List<String>): List<User>
}