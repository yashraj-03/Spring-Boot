package com.example.task2.controller;

import com.example.task2.models.studentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
    @GetMapping("/")
    public studentModel getStudent(){
        studentModel student  = new studentModel();
        student.setId(74);
        student.setName("Yash Raj Sharma");
        student.setEmail("yash.sharma@gmail.com");
        return student;
    }
}
