package com.stackroute.RESTServiceDemo.controller;

import com.stackroute.RESTServiceDemo.Service.StudentServiceImpl;
import com.stackroute.RESTServiceDemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private StudentServiceImpl service;


    @Autowired
    public StudentController(StudentServiceImpl service) {
        this.service = service;
    }

     @GetMapping("/student")
     public List<Student> getStudent(){
        return service.getAllStudents();
     }

     @PostMapping("/student")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(service.saveStudent(student),HttpStatus.CREATED);
     }


     @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
     }


     @PutMapping("student/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable int id){
        return  new ResponseEntity<Student>(service.updateStudent(id ,student),HttpStatus.OK);
     }



}
