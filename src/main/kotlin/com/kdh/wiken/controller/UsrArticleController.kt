package com.kdh.wiken.controller

import com.kdh.wiken.service.ArticleService
import com.kdh.wiken.vo.Article
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class UsrArticleController (private val articleService : ArticleService) {
    @RequestMapping("usr/article/getArticles")
    @ResponseBody
    fun showMain(): List<Article> {
        return articleService.getArticles()
    }
}