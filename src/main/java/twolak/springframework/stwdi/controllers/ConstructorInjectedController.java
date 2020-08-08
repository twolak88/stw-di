package twolak.springframework.stwdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import twolak.springframework.stwdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {
    
    private final GreetingService greetingService;
    
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
	this.greetingService = greetingService;
    }
    
    public String getGreetings() {
	return greetingService.sayGreeting();
    }
}
