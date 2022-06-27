package com.genspark.H2Toturial.service;

import com.genspark.H2Toturial.entity.Student;
import com.genspark.H2Toturial.repository_doa.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImplementation implements StudentService{

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAllStudents() {return this.studentDao.findAll();}

    @Override
    public Student addStudent(Student student) {return this.studentDao.save(student);}

}
