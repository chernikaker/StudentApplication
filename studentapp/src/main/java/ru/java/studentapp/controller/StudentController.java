package ru.java.studentapp.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("save_student")
    public String saveStudent(@RequestBody Student student){
        service.saveStudent(student);
        return "Student successfully saved";
    }

    @GetMapping("/{email}")
    public Student getStudentByEmail(@PathVariable String email){
        return service.findStudentByEmail(email);
    }

    @PutMapping("update_student")
    public Student updateStudent( @RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudentByEmail(@PathVariable String email){
        service.deleteStudentByEmail(email);
    }




}

