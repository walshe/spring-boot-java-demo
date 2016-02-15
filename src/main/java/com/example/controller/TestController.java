package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.UserRepository;

@Controller
public class TestController {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/test")
	public @ResponseBody String test(){
		return "test";
	}
	
	@RequestMapping(value="/userCount")
	public @ResponseBody Long userCount(){
		return userRepository.count();
	}
	
	
}
