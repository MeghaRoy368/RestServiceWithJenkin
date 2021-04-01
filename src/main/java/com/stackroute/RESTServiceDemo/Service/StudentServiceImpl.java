package com.stackroute.RESTServiceDemo.Service;

import com.stackroute.RESTServiceDemo.model.Student;
import com.stackroute.RESTServiceDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentServiceDAO{

    private StudentRepository repository;

    @Autowired
    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return (List<Student>) repository.findAll();
    }

    @Override
    public void deleteStudent(int id) {
        repository.deleteById(id);
    }

    @Override
    public Student updateStudent( int id ,Student student) {
        return repository.save(student);
    }

}
