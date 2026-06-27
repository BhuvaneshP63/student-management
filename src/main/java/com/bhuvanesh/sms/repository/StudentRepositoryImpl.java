package com.bhuvanesh.sms.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bhuvanesh.sms.mapper.StudentRowMapper;
import com.bhuvanesh.sms.model.Student;
@Repository
public class StudentRepositoryImpl implements StudentRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveStudent(Student student) {
		String sql = "INSERT INTO student(id,name,department,marks) VALUES(?,?,?,?)";
		jdbcTemplate.update(sql,
				student.getId(),
				student.getName(),
				student.getDepartment(),
				student.getMarks()
				);
		System.out.println("Student saved sucessfuly!!");
		
	}

	@Override
	public Student getStudent(int id) {
		 String sql = "SELECT * FROM student where id = ?";

		    return jdbcTemplate.queryForObject(sql,new StudentRowMapper(),id);
	}

	@Override
	public void updateStudent(Student student) {
		String sql = "UPDATE student set name = ?,department = ?,marks = ? where id = ?";
		jdbcTemplate.update(sql,
				student.getName(),
				student.getDepartment(),
				student.getMarks(),
				student.getId());
		System.out.println("Sucessfully updated!!");
		
	}

	@Override
	public void deleteStudent(int id) {
		String sql = "Delete From student where id = ?";
		jdbcTemplate.update(sql,id);
		System.out.println("Student deleted!!");
		
	}

}
