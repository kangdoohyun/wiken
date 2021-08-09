package com.kdh.wiken.repository

import com.jhs.wiken.vo.Ken
import org.apache.ibatis.annotations.*

@Mapper
interface KenRepository {
    @Insert(
        """
        INSERT INTO ken
        SET regDate = NOW(),
        updateDate = NOW(),
        memberId = #{memberId},
        title = #{title},
        `source` = #{source},
        result = #{result},
        typeCode = 'common',
        type2Code = 'markdown'; 
        """
    )
    fun write(
        @Param("memberId") memberId: Int,
        @Param("title") title: String,
        @Param("source") source: String,
        @Param("result") result: String
    )

    @Select(
        """
        SELECT LAST_INSERT_ID()
        """
    )
    fun getLastInsertId(): Int

    @Select(
        """
        SELECT *
        FROM ken
        WHERE id = #{id}
        """
    )
    fun getKen(@Param("id") id: Int): Ken?
    @Update(
        """
        <script>
        UPDATE ken
        <set>
            updateDate = NOW(),
            title = #{title},
            `source` = #{source},
            result = #{result},
        </set>
        WHERE id = #{id}
        </script>
        """
    )
    fun modify(
        @Param("id") id: Int,
        @Param("title") title: String,
        @Param("source") source: String,
        @Param("result") result: String
    )

}
