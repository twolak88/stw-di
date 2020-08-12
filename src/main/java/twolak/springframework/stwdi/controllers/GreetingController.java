package twolak.springframework.stwdi.controllers;

import org.springframework.stereotype.Controller;

import twolak.springframework.stwdi.services.GreetingService;

@Controller
public class GreetingController {
    
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
	this.greetingService = greetingService;
    }
    
    public String sayHello() {
	return greetingService.sayGreeting();
    }

}
