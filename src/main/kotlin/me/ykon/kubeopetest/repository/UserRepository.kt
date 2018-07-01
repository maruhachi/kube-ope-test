package me.ykon.kubeopetest.repository

import me.ykon.kubeopetest.entity.User
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface UserRepository{

    @Select("select * from user")
    fun findAll():List<User>
}
