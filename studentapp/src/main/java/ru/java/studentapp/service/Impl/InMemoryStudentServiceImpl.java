package ru.java.studentapp.service.Impl;

import org.springframework.stereotype.Service;
import ru.java.studentapp.model.Student;
import ru.java.studentapp.service.StudentService;

import java.util.List;

@Service
public class InMemoryStudentServiceImpl implements StudentService {

    @Override
    public List<Student> findAllStudents()
    {
        return List.of(
                Student.builder().firstName("Anna").age(11).build(),
                Student.builder().firstName("Anton").age(20).build()
        );
    }
}
