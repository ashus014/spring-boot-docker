package com.ashu.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/ashu")
    public String getMessage() {
        return "<h1>Hi There, Welcome to Docker</h1>";
    }
}
