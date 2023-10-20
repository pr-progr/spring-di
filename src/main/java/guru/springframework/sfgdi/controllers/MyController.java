package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreeetingService;

@Controller
public class MyController {
	
	final private GreeetingService greeetingService;
	
	

	public MyController(GreeetingService greeetingService) {
		this.greeetingService = greeetingService;
	}



	public String hello() {
		return greeetingService.sayGreetinng();
	}
}
