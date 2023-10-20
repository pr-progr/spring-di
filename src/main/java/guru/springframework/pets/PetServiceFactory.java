package guru.springframework.pets;

public class PetServiceFactory {
	
	public PetService getType(String petType) {
		switch (petType) {
		case "dog":
			return new PetServiceDogs();
		case "cat":
			return new PetServiceCats();
		default:
			return new PetServiceDogs();
		}
	}

}
