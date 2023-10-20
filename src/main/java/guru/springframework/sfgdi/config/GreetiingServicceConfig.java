package guru.springframework.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import guru.springframework.pets.PetService;
import guru.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.repositooriiies.GreetingEnglishRepository;
import guru.springframework.sfgdi.repositooriiies.GreetingEnglishRepositoryImpl;
import guru.springframework.sfgdi.services.ConstrructorGreetingService;
import guru.springframework.sfgdi.services.I18nGreeetingEngliishService;
import guru.springframework.sfgdi.services.I18nGreeetingSpanishService;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetiiingServiice;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;

@Configuration
public class GreetiingServicceConfig {
		
	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}
	
	@Profile({"dog","default"})
	@Bean
	PetService petServiceDogs(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getType("dog");
	}
	
	@Profile("cats")
	@Bean
	PetService petServiceCats(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getType("cat");
	}
	
	@Profile({"ES","default"})
	@Bean("i18nSeriice")
	I18nGreeetingSpanishService I18nGreeetingSpanishService() {
		return new I18nGreeetingSpanishService();
	}
	
	@Bean
	GreetingEnglishRepository greetingEnglishRepository() {
		return new GreetingEnglishRepositoryImpl();
	}
	
	@Profile("EN")
	@Bean
	I18nGreeetingEngliishService i18nSeriice(GreetingEnglishRepository greetingEnglishRepository) {
		return new I18nGreeetingEngliishService(greetingEnglishRepository);
	}
	
	@Primary
	@Bean
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}
	
	@Bean
	public ConstrructorGreetingService constrructorGreetingService(){
		return new ConstrructorGreetingService();
	}
	
	@Bean
	public PropertyInjectedGreetiiingServiice propertyInjectedGreetiiingServiice() {
		return new PropertyInjectedGreetiiingServiice();
	}
	
	@Bean
	public SetterInjectedGreetingService setterInjectedGreetingService() {
		return new SetterInjectedGreetingService();
	}
}