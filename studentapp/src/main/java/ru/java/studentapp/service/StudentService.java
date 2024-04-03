package ru.java.studentapp.service;

import org.springframework.stereotype.Service;
import ru.java.studentapp.model.Student;

import java.util.List;


public interface StudentService {

     List<Student> findAllStudents();

     Student saveStudent(Student student);

     Student updateStudent(Student student);

     Student findStudentByEmail(String email);

     void deleteStudentByEmail (String email);


}
