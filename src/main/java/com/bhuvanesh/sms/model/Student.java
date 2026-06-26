package com.bhuvanesh.sms.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Student {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student() {
		System.out.println("Student created...");
	}
	public Student(int id, String name, String department, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	private String name;
	private String department;
	private double marks;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", marks=" + marks + "]";
	}
	@PostConstruct
	public void init() {
	    System.out.println("Student Bean Initialized");
	}

	@PreDestroy
	public void destroy() {
	    System.out.println("Student Bean Destroyed");
	}
	

}
