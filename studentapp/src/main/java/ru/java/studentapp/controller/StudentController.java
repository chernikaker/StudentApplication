package ru.java.studentapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.java.studentapp.model.Student;



import java.util.List;

import static ru.java.studentapp.model.Student.*;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> findAllStudents(){

        return List.of(
              Student.builder().firstName("Anna").age(11).build(),
                Student.builder().firstName("Anton").age(20).build()
        );
    }

}

