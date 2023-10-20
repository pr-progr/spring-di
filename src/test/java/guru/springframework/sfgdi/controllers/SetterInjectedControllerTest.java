package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.ConstrructorGreetingService;


class SetterInjectedControllerTest {
	
	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();
		controller.setGreeetingService(new ConstrructorGreetingService());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
