package com.bhuvanesh.sms.repository;

import org.springframework.stereotype.Repository;

import com.bhuvanesh.sms.model.Student;
@Repository
public class StudentRepositoryImpl implements StudentRepository {

	@Override
	public void saveStudent(Student student) {
		System.out.println("------------------------");
		System.out.println("Student saved sucessfully");
		System.out.println(student);
		System.out.println("------------------------");
		
	}

	@Override
	public Student getStudent(int id) {
		 System.out.println("Student found: " + id);
		 Student student = new Student();
		    student.setId(id);
		    student.setName("Bhuvanesh");
		    student.setDepartment("CSE");
		    student.setMarks(90);

		    return student;
	}

	@Override
	public void updateStudent(Student student) {
		System.out.println("Student updated");
		
	}

	@Override
	public void deleteStudent(int id) {
		System.out.println("Student deleted:"+id);
		
	}

}
