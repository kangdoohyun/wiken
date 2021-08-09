package com.kdh.wiken.vo

import com.kdh.wiken.util.Ut
import org.springframework.context.annotation.Scope
import org.springframework.context.annotation.ScopedProxyMode
import org.springframework.stereotype.Component
import javax.servlet.http.HttpSession

@Component("rq")
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
class Rq {
    private var isLogined: Boolean = false
    private var loginedMember: Member? = null;

    fun isLogined(): Boolean{
        return this.isLogined
    }

    fun getLoginedMember(): Member? {
        return loginedMember
    }

    fun setLoginInfo(session: HttpSession) {
        if (session.getAttribute("loginedMemberJsonStr") == null) {
            return
        }

        val loginedMemberJsonStr = session.getAttribute("loginedMemberJsonStr") as String

        isLogined = true
        loginedMember = Ut.getObjFromJsonStr(loginedMemberJsonStr)
    }
}