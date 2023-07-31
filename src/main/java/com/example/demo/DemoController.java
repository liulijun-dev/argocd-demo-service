package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class DemoController {

    @GetMapping("/")
    public ResponseEntity<String> helloWorld() {
        String who = Optional.ofNullable(System.getenv("who")).orElse("World");
        return ResponseEntity.ok("Hello " + who);
    }
}
