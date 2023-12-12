package com.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Repository.StudentRepository;
import com.entiity.Student;
import com.service.StudentService;
@Service
public class StudentServiceImpl  implements StudentService{

	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	@Override
	public Student getStudentBYId(int id) {
	return studentRepository.findById(id).get();
	}
	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}
	@Override
	public void deleteById(int id) {
		studentRepository.deleteById(id);
		
	}
	
	

	
	
	
	
	
}
