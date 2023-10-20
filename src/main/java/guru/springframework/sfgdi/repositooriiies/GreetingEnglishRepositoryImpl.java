package guru.springframework.sfgdi.repositooriiies;

public class GreetingEnglishRepositoryImpl implements GreetingEnglishRepository {

	@Override
	public String getGreetinng() {
		return "Hello Repository D.I";
	}
	
}
