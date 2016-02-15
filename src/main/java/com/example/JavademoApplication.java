package com.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.UserRepository;
import com.example.domain.User;

@SpringBootApplication
public class JavademoApplication {

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JavademoApplication.class, args);
	}
	
	@PostConstruct
	private void init(){
		User user = new User();
		user.setFirstName("emmett");
		user.setLastName("Walsh");
		userRepository.save(user);
	}
	
	
}
