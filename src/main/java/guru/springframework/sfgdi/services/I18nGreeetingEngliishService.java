package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositooriiies.GreetingEnglishRepository;

public class I18nGreeetingEngliishService implements GreeetingService {
	
	private final GreetingEnglishRepository greetingEnglishRepository;
	
	public I18nGreeetingEngliishService(GreetingEnglishRepository greetingEnglishRepository) {
		this.greetingEnglishRepository = greetingEnglishRepository;
	}

	@Override
	public String sayGreetinng() {
		return greetingEnglishRepository.getGreetinng();

	}



}
