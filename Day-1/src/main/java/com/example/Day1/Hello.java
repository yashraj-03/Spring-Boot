package com.example.Day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String hey() {
        return ("hello World");
    }
    @GetMapping("/a")
    public String welcome() {
        return ("welcome");
    }
    @GetMapping("/b")
    public String day() {
        return ("day");
    }
}
