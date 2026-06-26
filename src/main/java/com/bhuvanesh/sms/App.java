package com.bhuvanesh.sms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhuvanesh.sms.config.AppConfig;
import com.bhuvanesh.sms.controller.StudentController;
import com.bhuvanesh.sms.model.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = context.getBean(Student.class);
		student.setId(101);
        student.setName("Bhuvanesh");
        student.setDepartment("CSE");
        student.setMarks(90);
        StudentController controller = context.getBean(StudentController.class);
        controller.registerStudent(student);
        controller.viewStudent(101);
	}

}
