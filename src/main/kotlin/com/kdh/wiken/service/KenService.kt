package com.kdh.wiken.service

import com.kdh.wiken.repository.ArticleRepository
import com.kdh.wiken.repository.KenRepository
import com.kdh.wiken.vo.Article
import com.kdh.wiken.vo.ResultData
import org.springframework.stereotype.Service

@Service("kenService")
class KenService(private val kenRepository: KenRepository) {
    fun write(memberId: Int, title: String, source: String, result: String): ResultData<Int> {
        kenRepository.write(memberId, title, source, result)
        val id = kenRepository.getLastInsertId()

        return ResultData.form("S-1", "${id}번 켄이 생성되었습니다.", "id", id)
    }

}
