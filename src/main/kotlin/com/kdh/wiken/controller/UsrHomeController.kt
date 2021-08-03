package com.kdh.wiken.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class UsrHomeController {
    @RequestMapping("usr/home/main")
    @ResponseBody
    fun showMain(): String {
        return "Hi~ Hello How Are You"
    }
}