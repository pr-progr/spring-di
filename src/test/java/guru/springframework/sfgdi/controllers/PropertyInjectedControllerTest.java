package guru.springframework.sfgdi.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import guru.springframework.sfgdi.services.ConstrructorGreetingService;

public class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;
	
	@Before
	public void setUp() {
		controller = new PropertyInjectedController();
		controller.greeetingService = new ConstrructorGreetingService();
		
	}
	
	@Test
	public void getGreeting() {
		System.out.print(controller.getGreeting());
	}

}
