package com.genspark.H2Toturial;

import com.genspark.H2Toturial.entity.Student;
import com.genspark.H2Toturial.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class H2ToturialApplicationTests {
	@Autowired
	StudentService studentService;
	@Test
	void postTest() {
		Student student = new Student();
		student.setStudentName("Junit");
		student.setCourseName("Test Course");
		student.setCampusName("Test Campus");

		studentService.addStudent(student);
		Assert.isTrue(studentService.getAllStudents().get(studentService.getAllStudents().size() -1).getStudentName().contains(student.getStudentName()));
	}

	@Test
	void GetAllCourses(){
		Assert.notEmpty(studentService.getAllStudents());
	}

	@Test
	void getCourseById(){
		Student student = studentService.getStudentByID(studentService.getAllStudents().size() -1);
		Assert.isTrue(studentService.getStudentByID(studentService.getAllStudents().size() -1).getStudentId() == student.getStudentId());
	}

	@Test
	void deleteCourseById(){
		Student student = studentService.getAllStudents().get(studentService.getAllStudents().size() -1);
		studentService.deleteStudent(student.getStudentId());
		Assert.isTrue(studentService.getStudentByID(studentService.getAllStudents().size() -1).getStudentId() != student.getStudentId());
	}

}
