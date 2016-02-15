package com.example.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.JavademoApplication;
import com.example.domain.User;

import static org.junit.Assert.*;

import javax.transaction.Transactional;

@Profile("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(JavademoApplication.class)
@Transactional
public class UserRepositoryDaoIntegrationTest {
	
	@Autowired UserRepository userRepository;
	
	@Before
	public void setUp(){
		User user = new User();
		user.setFirstName("Joe");
		user.setLastName("bloggs");
	}
	
	@Test
	public void testCount(){
		assertEquals(1, userRepository.count());
	}

}
