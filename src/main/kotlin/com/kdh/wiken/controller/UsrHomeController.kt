package com.kdh.wiken.controller

import com.kdh.wiken.vo.Rq
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class UsrHomeController {
    @RequestMapping("home/main")
    fun showMain(model : Model): String {
        model.addAttribute("name" , "홍길동" )
        model.addAttribute("rq", Rq())
        
        return "usr/home/main"
    }
}