package guru.springframework.sfgdi.services;

public class PropertyInjectedGreetiiingServiice implements GreeetingService {

	@Override
	public String sayGreetinng() {
		return "Hello World - Property";
	}

}
