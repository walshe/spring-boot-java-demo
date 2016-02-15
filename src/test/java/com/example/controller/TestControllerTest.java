package com.example.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.example.dao.UserRepository;

public class TestControllerTest {

	@InjectMocks
	private TestController testController;
	
	@Mock
	private UserRepository userRepository;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testUserCount(){
		Mockito.when(userRepository.count()).thenReturn(5L);
		
		assertEquals(new Long(5), testController.userCount());
		
		verify(userRepository, times(1)).count();
		
	}
	
	
}
