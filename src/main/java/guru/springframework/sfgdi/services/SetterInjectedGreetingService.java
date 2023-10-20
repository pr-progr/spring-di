package guru.springframework.sfgdi.services;

public class SetterInjectedGreetingService implements GreeetingService {

	@Override
	public String sayGreetinng() {
		return "Hello World - Setter";
	}

}
