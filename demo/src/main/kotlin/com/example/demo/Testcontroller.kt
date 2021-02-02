package com.example.demo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class Testcontroller {


    @GetMapping(path = ["/test"], consumes = ["application/json"])
    public fun testConsume() : ResponseEntity<Long> {

        return ResponseEntity.ok(1);
    }

}