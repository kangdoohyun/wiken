package com.kdh.wiken.vo

import com.kdh.wiken.util.Ut

class KenSourceInterpreter(
    private val source: String,
    private val kenConfig: KenConfig
) {
    companion object{
        fun from(source: String): KenSourceInterpreter {
            val hasConfig = source.contains("$$" + "config")

            if ( hasConfig ) {
                val configBIts = source.split("$$", limit = 3)
                val sourceConfig = configBIts[1].substring(6).trim()

                val kenConfig = Ut.getObjFromYmlStr<KenConfig>(sourceConfig)

                return KenSourceInterpreter(source, kenConfig)
            }

            return KenSourceInterpreter(source, KenConfig("", arrayListOf()))
        }
    }
    fun getTitle(): String {
        return kenConfig.title
    }
}
