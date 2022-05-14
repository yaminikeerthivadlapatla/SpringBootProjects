package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public StudentService() {

	}

	public Student addstudent(Student s) {
		return studentRepository.save(s);
	}

	public List<Student> getStudent() {
		return studentRepository.findAll();
	}
	public Student updatestudent(Student s) {
		return studentRepository.save(s);
	}
}