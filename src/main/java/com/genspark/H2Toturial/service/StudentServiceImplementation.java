package com.genspark.H2Toturial.service;

import com.genspark.H2Toturial.entity.Student;
import com.genspark.H2Toturial.repository_doa.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplementation implements StudentService{

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAllStudents() {return this.studentDao.findAll();}

    @Override
    public Student updateStudent(Student student) {return  this.studentDao.save(student);}

    @Override
    public Student addStudent(Student student) {return this.studentDao.save(student);}

    @Override
    public String deleteStudent(long id) {this.studentDao.existsById(id); return "Deleted Successfully";}

    @Override
    public Student getStudentByID(long id) {
        Optional<Student> student = this.studentDao.findById(id);

        Student students = null;
        if(student.isPresent()){
            students = student.get();
        }
        else
            throw new RuntimeException("Error! Student Id is not found");

        return students;
    }


}
