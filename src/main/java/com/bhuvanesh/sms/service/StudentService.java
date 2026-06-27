package com.bhuvanesh.sms.service;

import com.bhuvanesh.sms.model.Student;

public interface StudentService {
	void registerStudent(Student student);
	Student viewStudent(int id);
	void updateStudent(Student student);
	void removeStudent(int id);
	void registerStudentUsingNamedParameter(Student student);
	

}
