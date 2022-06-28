package com.genspark.H2Toturial.service;

import com.genspark.H2Toturial.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {

    List<Student> getAllStudents();

    Student updateStudent(Student student);

    Student addStudent(Student student);

    String deleteStudent(long id);

    Student getStudentByID(long id);
}
