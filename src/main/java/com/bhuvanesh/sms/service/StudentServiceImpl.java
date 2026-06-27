package com.bhuvanesh.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bhuvanesh.sms.model.Student;
import com.bhuvanesh.sms.notification.Notification;
import com.bhuvanesh.sms.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
	private final StudentRepository studentrepository;
	private final Notification notification;
	@Autowired
	public StudentServiceImpl(StudentRepository studentrepository, @Qualifier("smsNotification") Notification notification) {
		super();
		this.studentrepository = studentrepository;
		this.notification = notification;
	}

	
	

	@Override
	public void registerStudent(Student student) {
		System.out.println("Checking student details.....");
		if(student.getMarks()>=35) {
			studentrepository.saveStudent(student);
			notification.sendNotification("Student regisstered sucessfully");
		}else {
			System.out.println("Student failed.Registration cancelled");
		}
		
	}

	@Override
	public Student viewStudent(int id) {
		Student student = studentrepository.getStudent(id);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		studentrepository.updateStudent(student);
		
	}

	@Override
	public void removeStudent(int id) {
		studentrepository.deleteStudent(id);
		
	}
	@Override
	public void registerStudentUsingNamedParameter(Student student) {
	    studentrepository.saveStudentUsingNamedParameter(student);
	}

}
