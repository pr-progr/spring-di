package guru.springframework.sfgdi.services;

public class PrimaryGreetingService implements GreeetingService {

	@Override
	public String sayGreetinng() {
		return "Hello Primary";
	}

}
