package com.kdh.wiken.repository

import com.kdh.wiken.vo.Article
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface ArticleRepository {
    @Select("""
        SELECT * 
        FROM article
        ORDER BY id DESC
    """)
    fun getArticles(): List<Article>

}
