package me.ykon.kubeopetest.app

import lombok.extern.slf4j.Slf4j
import me.ykon.kubeopetest.entity.User
import me.ykon.kubeopetest.repository.UserRepository
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Slf4j
@Controller
class UserController(private val userRepository: UserRepository){

    @GetMapping("user")
    @ResponseBody
    fun getAll():List<User>{

        val userList = userRepository.findAll()
        return userList

    }

}