package com.kdh.wiken.controller

import com.kdh.wiken.service.ArticleService
import com.kdh.wiken.vo.Rq
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class UsrArticleController (private val articleService : ArticleService) {
    @Autowired
    private lateinit var rq: Rq

    @RequestMapping("article/list")
    fun showList(model : Model): String {
        val articles =  articleService.getArticles()

        model.set("articles", articles)

        return "usr/article/list"
    }
}