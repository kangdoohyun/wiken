package com.kdh.wiken.config

import nz.net.ultraq.thymeleaf.LayoutDialect
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class LayoutConfig {
    @Bean
    fun layoutDialect(): LayoutDialect {
        return LayoutDialect()
    }
}