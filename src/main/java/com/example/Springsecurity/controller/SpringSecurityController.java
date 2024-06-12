package com.example.Springsecurity.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SpringSecurityController {
    @GetMapping("/welcome")
    public String getmessage(){
        return"Hi hello welcome to our application";

    }
}
