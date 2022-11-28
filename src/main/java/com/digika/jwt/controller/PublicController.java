package com.digika.jwt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
@CrossOrigin(origins = "*")
public class PublicController {
    @GetMapping("hello")
    public String sayHello() {
        return "Hello world";
    }
}
