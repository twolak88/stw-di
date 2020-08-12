package twolak.springframework.stwdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import twolak.springframework.stwdi.services.GreetingRepository;
import twolak.springframework.stwdi.services.GreetingService;
import twolak.springframework.stwdi.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {
    
    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
	return new GreetingServiceFactory(greetingRepository);
    }
    
    @Bean
    @Primary
    @Profile({"default", "en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
	return greetingServiceFactory.createGreetingService("en");
    }
    
    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
	return greetingServiceFactory.createGreetingService("es");
    }
    
    @Bean
    @Primary
    @Profile("pl")
    GreetingService primaryPolishGreetingService(GreetingServiceFactory greetingServiceFactory) {
	return greetingServiceFactory.createGreetingService("pl");
    }
}
