package xyz.guawaz.service;

import xyz.guawaz.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    List<Student> findStudents();
}
