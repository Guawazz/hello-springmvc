package xyz.guawaz.dao;

import xyz.guawaz.domain.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudents();
}
