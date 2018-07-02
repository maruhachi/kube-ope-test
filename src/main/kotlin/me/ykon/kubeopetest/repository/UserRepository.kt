package me.ykon.kubeopetest.repository

import me.ykon.kubeopetest.entity.User
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface UserRepository{

    @Select("select * from user")
    fun findAll():List<User>

    @Insert("insert into user(id, name) values( #{id} , #{name} );")
    fun addUser(entry: User):Int

}
