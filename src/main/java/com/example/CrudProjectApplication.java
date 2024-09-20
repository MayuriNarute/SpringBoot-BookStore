package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.controller.CrudController;
import com.example.entity.Student;
import com.example.repository.StudentsRepository;

@SpringBootApplication
@EnableJpaRepositories("com.example.repository")
public class CrudProjectApplication implements CommandLineRunner{

	@Autowired
	private StudentsRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(CrudProjectApplication.class, args);
	}
	@Override
	public void run(String ...args)throws Exception{
		
		
	}

}
