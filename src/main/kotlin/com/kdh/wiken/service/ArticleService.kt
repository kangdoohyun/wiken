package com.kdh.wiken.service

import com.kdh.wiken.repository.ArticleRepository
import com.kdh.wiken.vo.Article
import org.springframework.stereotype.Service

@Service("articleService")
class ArticleService (private val articleRepository: ArticleRepository) {
    fun getArticles(): List<Article> {
        return articleRepository.getArticles()
    }

}
