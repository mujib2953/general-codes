package com.adnacoder.service;

import com.adnacoder.dao.StudentDao;
import com.adnacoder.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("fakeData")
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student getStudent(int id) { return studentDao.getStudent(id); }

    public void removeStudentById(int id) { studentDao.removeStudentById(id); }

    public void updateStudent(Student student) { studentDao.updateStudent(student); }

    public void insertStudent(Student student) { studentDao.insertStudent(student); }
}
