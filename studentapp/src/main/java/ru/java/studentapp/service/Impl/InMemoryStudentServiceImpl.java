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
        return null;
    }

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public Student findStudentByEmail(String email) {
        return null;
    }

    @Override
    public void deleteStudentByEmail(String email) {

    }
}
