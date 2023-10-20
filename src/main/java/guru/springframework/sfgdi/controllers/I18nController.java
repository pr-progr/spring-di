package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreeetingService;

@Controller
public class I18nController {
	
	private final GreeetingService greeetingService;

	public I18nController(@Qualifier("i18nSeriice") GreeetingService greeetingService) {
		this.greeetingService = greeetingService;
	}
	
	public String sayGreeting() {
		return greeetingService.sayGreetinng();
	}
	
	
}
