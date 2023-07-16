package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaExampleApplication.class, args);
		UserRepository repo= context.getBean(UserRepository.class);
			
		
//		User user=new User();
//		user.setName("Aryan Prajapati");
//		user.setCity("Ahmedabad");
//		user.setStatus("hi this is Aryan");
		
		
//		User user1=new User();
//		user1.setName("Lucky");
//		user1.setCity("Ahmedabad");
//		user1.setStatus("Hi this is Lucky");
////		
//		User user2=new User();
//		user2.setName("Hetal");
//		user2.setCity("Mehsana");
//		user2.setStatus("Hi this is Hetal");
//
//		List<User> users = List.of(user1,user2);
//		
		
		
		/////////////////////////CREATE///////////////////////////////
		
		//////////saving single user////////////////
//		User savedUser = repo.save(user);
		
		//////////saving all users/////////////////
//		Iterable<User> savedUsers = repo.saveAll(users);
//		System.out.println(savedUsers);
		
		
		
		
		
		//////////////////////////READ///////////////////////////////
		
		/////////////////reading single user///////////////
//		Optional<User> m = repo.findById(1);
//		User user = m.get();
//		System.out.println(user);
		
		/////////////////reading all users/////////////////
//		Iterable<User> allusers = repo.findAll();
//		allusers.forEach(user -> System.out.println(user));
		
		
		
		
		
		////////////////////////////UPDATE/////////////////////////////
		
		///////////////updating an user////////////////////
//		Optional<User> opt = repo.findById(1);
//		User user = opt.get();
//		user.setName("Aryan");
//		user.setCity("Kolkata");
//		User updatedUser = repo.save(user);
//		System.out.println(updatedUser);
		
		
		
		
		
		/////////////////////////////DELETE////////////////////////////
		
		////////////////////deleting single user//////////////////
//		repo.deleteById(2);
//		System.out.println("Deleted...!");
		
		///////////////////deleting all users////////////////////////
//		repo.deleteAll();
//		System.out.println("Deleted All...!!");
		
		
		
		
		
		/////////////////////////CUSTOM METHODS/////////////////////////
	
//		List<User> user = repo.findByNameStartingWith("He");
//		System.out.println(user);
	}

}
