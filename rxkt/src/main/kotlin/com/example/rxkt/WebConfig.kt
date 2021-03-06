package com.example.rxkt

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.HandlerMapping
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter

@Configuration
class WebConfig {

    @Bean
    fun handlerMapping() : HandlerMapping {
        var map = mapOf("/path" to MyWebSocketHandler())
        var order = -1

        return SimpleUrlHandlerMapping(map, order)
    }

    @Bean
    fun handlerAdapter() = WebSocketHandlerAdapter()
}