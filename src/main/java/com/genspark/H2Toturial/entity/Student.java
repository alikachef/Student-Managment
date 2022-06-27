package com.genspark.H2Toturial.entity;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long studentId;
    @Column
    private String studentName;
    @Column
    private String courseName;
    @Column
    private String campusName;

    public Long getStudentId() {return studentId;}

    public String getStudentName() {return studentName;}
    public void setStudentName(String studentName) {this.studentName = studentName;}

    public String getCourseName() {return courseName;}
    public void setCourseName(String courseName) {this.courseName = courseName;}

    public String getCampusName() {return campusName;}
    public void setCampusName(String campusName) {this.campusName = campusName;}

    public Student(){}

    public Student(String studentName, String courseName, String campusName) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.campusName = campusName;
    }
}
