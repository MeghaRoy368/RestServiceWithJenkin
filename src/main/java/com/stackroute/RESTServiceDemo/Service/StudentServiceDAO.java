package com.stackroute.RESTServiceDemo.Service;

import com.stackroute.RESTServiceDemo.model.Student;

import java.util.List;

public interface StudentServiceDAO {

    Student  saveStudent(Student student);
    List<Student> getAllStudents();
    void deleteStudent(int id);
    public Student updateStudent(int id, Student student);
}
