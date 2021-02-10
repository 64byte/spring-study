package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.LocaleContextResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/error")
public class ErrorRestController {

    public ResponseEntity<Long> handle(HttpServletRequest request) {

        return new ResponseEntity<>(1L, HttpStatus.BAD_REQUEST);

    }

}
