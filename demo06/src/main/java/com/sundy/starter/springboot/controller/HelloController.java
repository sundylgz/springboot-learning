package com.sundy.starter.springboot.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public ResponseEntity hello() {
        if (true) {
            throw new RuntimeException("test");
        }
        return ResponseEntity.ok("hello");
    }
}
