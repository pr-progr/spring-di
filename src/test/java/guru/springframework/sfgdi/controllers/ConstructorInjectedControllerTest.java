package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.ConstrructorGreetingService;

class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new ConstrructorGreetingService());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
