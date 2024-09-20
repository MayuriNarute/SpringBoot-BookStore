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
	//private CrudController crd;
	public static void main(String[] args) {
		SpringApplication.run(CrudProjectApplication.class, args);
	}
	@Override
	public void run(String ...args)throws Exception{
		
		Student s1=new Student("mayuri","pune","m@gmail.com");
		Student s2=new Student("akash","mumbai","a@gmail.com");
		Student s3=new Student("rahul","solapur","r@gmail.com");
		Student s4=new Student("mahendra","thane","mh@gmail.com");
		Student s5=new Student("sakshi","delhi","sk@gmail.com");

		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
		repo.save(s4);
		
		
	}

}
