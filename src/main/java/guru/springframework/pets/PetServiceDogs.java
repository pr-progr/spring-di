package guru.springframework.pets;

public class PetServiceDogs implements PetService {

	@Override
	public String getPetType() {
		return "Dogs are the best";
	}


}
