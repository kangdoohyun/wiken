package com.kdh.wiken.vo

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class KenConfig(
    val title: String,
    val keywords: List<String>
)
