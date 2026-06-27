package com.bhuvanesh.sms.repository;

import com.bhuvanesh.sms.model.Student;

public interface StudentRepository {
	void saveStudent(Student student);
	Student getStudent(int id);
	void updateStudent(Student student);
	void deleteStudent(int id);
	public void saveStudentUsingNamedParameter(Student student);
	

}
