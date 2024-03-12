package com.postman.postmantest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.postman.postmantest.model.Student;
import com.postman.postmantest.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepo;

	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> students = studentRepo.findAll();
		return new ResponseEntity<>(students, HttpStatus.OK);
	}

	@PostMapping("/student")
	public ResponseEntity<String> createStudent(@RequestBody Student student) {
		studentRepo.save(student);
		return ResponseEntity.status(HttpStatus.CREATED).body("Successfully created");
	}
}
