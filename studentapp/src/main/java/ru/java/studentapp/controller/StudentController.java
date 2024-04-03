package ru.java.studentapp.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.java.studentapp.model.Student;
import ru.java.studentapp.service.StudentService;


import java.util.List;

import static ru.java.studentapp.model.Student.*;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {


    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudents(){

        return service.findAllStudents();
    }

}

