package ru.java.studentapp.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.java.studentapp.model.Student;
import ru.java.studentapp.repository.InMemoryStudentDAO;
import ru.java.studentapp.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {

    private final InMemoryStudentDAO repository;
    @Override
    public List<Student> findAllStudents()
    {
        return repository.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {

        return repository.saveStudent(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public Student findStudentByEmail(String email) {

        return repository.findStudentByEmail(email);
    }

    @Override
    public void deleteStudentByEmail(String email) {

        repository.deleteStudentByEmail(email);
    }
}
