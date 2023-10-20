package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.pets.PetService;

@Controller
public class PetController {

	private final PetService petServce;

	public PetController(PetService petServce) {
		this.petServce = petServce;
	}
	
	public String wichthBest() {
		return petServce.getPetType();
	}
	
	
	
}
