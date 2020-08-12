package twolak.springframework.stwdi.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.Generated;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import twolak.services.ConstructorGreetingService;
import twolak.services.SetterGreetingService;

@Generated(value = "org.junit-tools-1.1.0")
public class SetterInjectedControllerTest {
    
    SetterInjectedController setterInjectedController;
    
    @BeforeEach
    public void setUp() throws Exception {
	setterInjectedController = new SetterInjectedController();
	setterInjectedController.setGreetingService(new SetterGreetingService());
    }
    
    @Test
    public void testGetGreeting() throws Exception {
	assertEquals("Hello World - Setter", setterInjectedController.getGreeting());
    }
}