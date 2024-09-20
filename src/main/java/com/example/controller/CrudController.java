package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import com.example.repository.StudentsRepository;
import com.example.entity.*;
@Controller

public class CrudController {

	 @Autowired
	    private StudentsRepository repo;

	    // Get all students

	    @GetMapping("/")
	    public String homePage(Model model) {
	    	 List<Student> students = repo.findAll();
	    	 model.addAttribute("studentlist", students);
	    	 return "index";
	    }
//	    public List<Student> getAllStudents() {
//	        return repo.findAll();
//	    }
	    
	    // Add a student
//	    @PostMapping
//	    public Student createStudent(@RequestBody Student student) {
//	        return repo.save(student);
//	    }
}
