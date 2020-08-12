package twolak.springframework.stwdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import twolak.springframework.stwdi.services.GreetingService;

@Controller
public class SetterInjectedController {
    
    private GreetingService greetingService;
    
    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String getGreeting() {
	return greetingService.sayGreeting();
    }  
}
