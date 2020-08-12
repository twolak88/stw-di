package twolak.springframework.stwdi.services;

public class PrimaryGreetingService implements GreetingService {
    
    private final GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
	this.greetingRepository = greetingRepository;
    }

    public String sayGreeting() {
	return greetingRepository.getEnglishGreeting();
    }

}
