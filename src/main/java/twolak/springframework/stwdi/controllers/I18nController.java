package twolak.springframework.stwdi.controllers;

import org.springframework.stereotype.Controller;

import twolak.springframework.stwdi.services.GreetingService;

@Controller
public class I18nController {
    
    private final GreetingService greetingService;

    public I18nController(GreetingService greetingService) {
	this.greetingService = greetingService;
    }
    
    public String sayHello() {
	return greetingService.sayGreeting();
    }

}
