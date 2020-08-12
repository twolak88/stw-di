package twolak.springframework.stwdi.services;

public class PrimaryPolishGreetingService implements GreetingService{
    
    private final GreetingRepository greetingRepository; 
    
    public PrimaryPolishGreetingService(GreetingRepository greetingRepository) {
	this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
	return greetingRepository.getPolishGreeting();
    }

}
