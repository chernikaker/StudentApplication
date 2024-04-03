package ru.java.studentapp.repository;

import org.springframework.stereotype.Repository;
import ru.java.studentapp.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDAO {

    private final List<Student> STUDENTS = new ArrayList<>();


    public List<Student> findAllStudents()
    {
        return STUDENTS;
    }

    public Student saveStudent(Student student) {

        STUDENTS.add(student);
        return student;
    }


    public Student updateStudent(Student student) {
        var studentIndex = IntStream.range(0,STUDENTS.size())
                .filter(index -> STUDENTS.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex>-1){
            STUDENTS.set(studentIndex, student);
            return student;
        }
        return null;
    }


    public Student findStudentByEmail(String email) {

        return STUDENTS.stream()
                .filter(element -> element.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }


    public void deleteStudentByEmail(String email) {

        var student = findStudentByEmail(email);
        if(student!=null){
            STUDENTS.remove(student);
        }
    }
}
