package com.example.rxkt

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.server.ServerResponse

@RestController
@RequestMapping
class DemoController {

    @GetMapping
    fun getDemo() : ResponseEntity<Long> {
        return ResponseEntity.ok(1)
    }
}