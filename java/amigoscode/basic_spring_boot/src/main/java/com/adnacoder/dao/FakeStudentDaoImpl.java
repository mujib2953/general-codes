package com.adnacoder.dao;

import com.adnacoder.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeData")
public class FakeStudentDaoImpl implements StudentDao {

    private static final Map<Integer, Student> students;

    static {
        students = new HashMap<>(){
            {
                put(1, new Student(1, "Saeed", "Computer Science"));
                put(2, new Student(2, "Baloo the bear", "Pilot"));
                put(3, new Student(3, "Bob the builder", "Civil Engineer"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents() {
        return students.values();
    }

    @Override
    public Student getStudent(final int id) {
        return students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        students.remove(id);
    }

    @Override
    public void updateStudent(Student student) {
        Student s = students.get(student.getId());

        s.setName(student.getName());
        s.setCourse(student.getCourse());

        students.put(student.getId(), s);
    }

    @Override
    public void insertStudent(Student s) {
        students.put(students.size(), s);
    }

}
