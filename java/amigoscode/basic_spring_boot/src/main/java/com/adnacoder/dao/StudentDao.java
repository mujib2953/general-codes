package com.adnacoder.dao;

import com.adnacoder.entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudent(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student s);
}
