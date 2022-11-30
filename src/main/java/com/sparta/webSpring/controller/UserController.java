package com.sparta.webSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/user/login")
    public String login() {
        // ...
    }

    @GetMapping("/user/logout")
    public String logout() {
        // ...
    }

    @GetMapping("/user/signup")
    public String signup() {
        // ...
    }

    @PostMapping("/user/signup")
    public String registerUser(SignupRequestDto requestDto) {
        // ...
    }
}