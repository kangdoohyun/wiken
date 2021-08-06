package com.kdh.wiken.interceptor

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
class BeforeActionInterceptor : HandlerInterceptor {
    override fun preHandle(req: HttpServletRequest, resp: HttpServletResponse, handler: Any): Boolean {
        println("인터셉터 실행")

        return super.preHandle(req, resp, handler)
    }
}