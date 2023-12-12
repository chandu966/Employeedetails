package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.entiity.Student;
import com.service.StudentService;
@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	//homepage
	@GetMapping("/")
	public String listStudent(Model model) {
		model.addAttribute("students", studentService.getAllStudent());
		return "home";
	}
	
	//open register page
	@GetMapping("/addstudent")
	public String form(Model model) {
		Student student=new Student();
		model.addAttribute("student", student);
		return "register";
	}
	//inserting data
	@PostMapping("/register")
	public String saveStudentData(@ModelAttribute Student student) {
		studentService.saveStudent(student);
		return "redirect:/";
	}
	@GetMapping("/edit/{id}")
	public String updateStudentform(@PathVariable int id, Model model) {
		model.addAttribute("student", studentService.getStudentBYId(id));
		return "editStudent";
	}
	@PostMapping("/update/{id}")
	public String updataStudentData(@PathVariable int id,@ModelAttribute Student student,Model model) {
	  Student student1 = studentService.getStudentBYId(id);
	  student1.setId(id);
	  student1.setName(student.getName());
	  student1.setLocation(student.getLocation());
	  student1.setEmail(student.getEmail());
	  student1.setNumber(student.getNumber());
	  
	  studentService.updateStudent(student1);
		return"redirect:/";
	}
	@GetMapping("/delete/{id}")
	public String deleteStudentData(@PathVariable int id) {
		studentService.deleteById(id);
		return"redirect:/";
	}
	
}
