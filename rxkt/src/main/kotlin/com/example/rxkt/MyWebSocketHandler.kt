package com.example.rxkt

import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.publisher.Mono

class MyWebSocketHandler : WebSocketHandler {
    override fun handle(session: WebSocketSession): Mono<Void> {
        return session.receive()
            .doOnNext {

            }
            .then()
    }
}