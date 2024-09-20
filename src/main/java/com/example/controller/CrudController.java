package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import com.example.repository.StudentsRepository;
import com.example.entity.*;
@RestController
@RequestMapping("/students")
public class CrudController {

	 @Autowired
	    private StudentsRepository repo;

	    // Get all students
	    @GetMapping
	    public List<Student> getAllStudents() {
	        return repo.findAll();
	    }

	    // Add a student
	    @PostMapping
	    public Student createStudent(@RequestBody Student student) {
	        return repo.save(student);
	    }
}
