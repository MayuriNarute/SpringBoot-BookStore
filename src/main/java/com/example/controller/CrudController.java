package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import com.example.repository.StudentsRepository;
import com.example.entity.*;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class CrudController {

	 @Autowired
	    private StudentsRepository repo;

	    // Get all students
	 
	    @GetMapping("/")
	    public String homePage(Model model) {
	    	 List<Student> students = repo.findAll();
	    	 model.addAttribute("studentlist", students);
	    	 if(students.isEmpty()) {
	    		 model.addAttribute("noRecords",true);
	    	 }else {
	    		 model.addAttribute("noRecords",false);

	    	 }
	    	 return "index";
	    }
	    
	    // Add a student
	    @GetMapping("/saveStudentPage")
	    public String saveStudentPage(Model model) {
	    	Student student=new Student();
	    	model.addAttribute("student",student);
	       return "add_student";
	    }
	    @PostMapping("/saveStudent")
	    public String saveStudent(@ModelAttribute("student") Student student) {
	    	repo.save(student);
	    	return "redirect:/";
	    }
	    
	    //delete a student
	    @GetMapping("/deleteStudent/{id}")
	    public String deleteStudent(@PathVariable("id") int id) {
	    	repo.deleteById(id);
	    	System.out.println("Student record deleted...");
	    	return "redirect:/";
	    }
	    
	    
}
