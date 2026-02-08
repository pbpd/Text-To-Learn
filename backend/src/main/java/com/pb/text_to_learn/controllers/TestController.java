package com.pb.text_to_learn.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/public/hello")
    public String publicHello() {
        return "Public Hello";
    }

    @GetMapping("/private/hello")
    public String privateHello() {
        return "Private OK";
    }
}
