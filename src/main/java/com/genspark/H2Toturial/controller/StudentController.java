package com.genspark.H2Toturial.controller;

import com.genspark.H2Toturial.entity.Student;
import com.genspark.H2Toturial.service.StudentService;
import com.genspark.H2Toturial.service.StudentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents(){ return this.studentService.getAllStudents();}

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){return this.studentService.addStudent(student);}
}
