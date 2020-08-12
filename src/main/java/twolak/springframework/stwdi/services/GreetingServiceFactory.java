package twolak.springframework.stwdi.services;

public class GreetingServiceFactory {
    
    private final GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
	this.greetingRepository = greetingRepository;
    }
    
    public GreetingService createGreetingService(String lang) {
	
	switch (lang) {
	case "en":
	    return new PrimaryGreetingService(greetingRepository);
	case "pl":
	    return new PrimaryPolishGreetingService(greetingRepository);
	case "es":
	    return new PrimarySpanishGreetingService(greetingRepository);
	default:
	    return new PrimaryGreetingService(greetingRepository);
	}
    }
}
