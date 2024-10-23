package com.shri.jdbc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.shri.jdbc.model.Student;
import com.shri.jdbc.service.StudentService;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
	ApplicationContext context = 	SpringApplication.run(SpringJdbcApplication.class, args);
		
		Student s = context.getBean(Student.class);
		s.setRollNo(101);
		s.setName("shridhar");
		s.setMarks(87);
		
		StudentService service = context.getBean(StudentService.class);
		
		service.addStudent(s);
		
		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
