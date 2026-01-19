package com.example.task3.controller;

import com.example.task3.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class home {

    @GetMapping("/")
    public ArrayList<StudentModel> getStudent() {
        ArrayList<StudentModel> students = new ArrayList<>();
        students.add(new StudentModel(1, "Yash Raj Sharma", "yash.sharma@gmail.com"));
        students.add(new StudentModel(2, "YashM", "maheshwariy076@gmail.com"));
        students.add(new StudentModel(3, "Gaurav", "gaurav@gmail.com"));
        students.add(new StudentModel(4, "Nisha", "nisha@gmail.com"));
        students.add(new StudentModel(5, "Yuvraj", "yuvraj77@gmail.com"));
        return students;
    }

    @GetMapping("/student/{id}")
    public StudentModel getStudentById(@PathVariable int id) {
        ArrayList<StudentModel> students = getStudent();

        for (StudentModel student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}