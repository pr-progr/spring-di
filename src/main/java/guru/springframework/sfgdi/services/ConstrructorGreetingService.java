package guru.springframework.sfgdi.services;

public class ConstrructorGreetingService implements GreeetingService {

	@Override
	public String sayGreetinng() {
		return "Hello World - Constructor";
	}

}
