package twolak.springframework.stwdi.controllers;

import org.springframework.stereotype.Controller;

import twolak.services.GreetingService;

@Controller
public class MyController {
    
    private final GreetingService greetingService;
    
    public MyController(GreetingService greetingService) {
	this.greetingService = greetingService;
    }

    public String getGreeting(){
	return greetingService.sayGreeting();
    }
}
