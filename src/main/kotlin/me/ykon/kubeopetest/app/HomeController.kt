package me.ykon.kubeopetest.app

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController{

    @GetMapping("home")
    fun home():String {

        return "home"
    }

}