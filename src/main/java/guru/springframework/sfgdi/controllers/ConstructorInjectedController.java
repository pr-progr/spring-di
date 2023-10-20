package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreeetingService;

@Controller
public class ConstructorInjectedController {
	
	private final GreeetingService greeetingService;

	
	public ConstructorInjectedController(@Qualifier("constrructorGreetingService") GreeetingService greeetingService) {
		this.greeetingService = greeetingService;
	}
	
	public String getGreeting() {
		return greeetingService.sayGreetinng();
	}

}
