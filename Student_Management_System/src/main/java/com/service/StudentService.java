package com.service;

import java.util.List;

import com.entiity.Student;

public interface StudentService {

	List<Student> getAllStudent();
	
	Student saveStudent(Student student);
	
	Student getStudentBYId(int id);
	
	Student updateStudent(Student student);
	
	void deleteById(int id);
}
