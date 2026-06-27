package com.bhuvanesh.sms.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bhuvanesh.sms.model.Student;

public class StudentRowMapper implements RowMapper<Student>{
	public Student mapRow(ResultSet rs,int rowNum) throws SQLException {
		Student s = new Student();
		s.setId(rs.getInt("id"));
		s.setName(rs.getString("name"));
		s.setDepartment(rs.getString("department"));
		s.setMarks(rs.getInt("marks"));
		return s;
	}
	

}
