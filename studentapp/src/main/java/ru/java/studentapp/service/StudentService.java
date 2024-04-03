package ru.java.studentapp.service;

import org.springframework.stereotype.Service;
import ru.java.studentapp.model.Student;

import java.util.List;


public interface StudentService {

     List<Student> findAllStudents();
}
