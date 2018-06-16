package me.ykon.kubeopetest.app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloApiController {

    @GetMapping("hello")
    fun hello(): String {

        return "hello"
    }

}