package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class HomeController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/")
	public String index() {
		return "Hello World";
	}
	
	
	@PostMapping("/saveStudent")
	public Student saveData(@RequestBody Student student) {
		studentRepository.save(student);
		return student;
	}
	
	@GetMapping("/getAllStudent")
	public List<Student> getAll(){
		List<Student> students = studentRepository.findAll();
		return students;
	}
	
	@DeleteMapping("/deleteStudent/{rollNo}")
	public String deleteStudent(@PathVariable int rollNo) {
		Student student = studentRepository.findById(rollNo).get();
		if(student != null) studentRepository.delete(student);
		return "Deleted successfully";
	}
	
	@PutMapping("/updateData")
	public Student updateStudentData(@RequestBody Student student) {
		studentRepository.save(student);
		return student;
	}
	
	@GetMapping("/getStudent/{rollNo}")
	public Student getStudentData(@PathVariable int rollNo) {
		Optional<Student> student = studentRepository.findById(rollNo);
		Student student1 = student.get();
		return student1;
	}
	
}
