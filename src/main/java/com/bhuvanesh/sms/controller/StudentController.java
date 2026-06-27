package com.bhuvanesh.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bhuvanesh.sms.model.Student;
import com.bhuvanesh.sms.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentservice;
	 public void registerStudent(Student student) {

	        System.out.println("Request Received for Student Registration...");

	        studentservice.registerStudent(student);

	    }

	    public void viewStudent(int id) {

	        Student student = studentservice.viewStudent(id);

	        System.out.println(student);

	    }

	    public void updateStudent(Student student) {

	        studentservice.updateStudent(student);

	    }

	    public void deleteStudent(int id) {

	        studentservice.removeStudent(id);

	    }
	    public void registerStudentUsingNamedParameter(Student student) {
	        studentservice.registerStudentUsingNamedParameter(student);
	    }

}
