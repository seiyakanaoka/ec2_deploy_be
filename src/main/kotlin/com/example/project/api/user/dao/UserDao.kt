package com.example.project.api.user.dao

import com.example.project.common.domain.User
import org.seasar.doma.Dao
import org.seasar.doma.Select
import org.seasar.doma.boot.ConfigAutowireable

@Dao
@ConfigAutowireable
interface UserDao {
  @Select
  fun listUser(): List<User>
}