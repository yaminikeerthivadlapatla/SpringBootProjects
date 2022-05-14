package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentservice; 

	@GetMapping("/home")
	public String welcome() {
		return "welcome"; 
	} 
	@GetMapping("/student")
	public List<Student> getStudent(){
		return this.studentservice.getStudent();
	}
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student s) {
		return this.studentservice.addstudent(s);
	}
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student s) {
		return this.studentservice.updatestudent(s);
	}
}