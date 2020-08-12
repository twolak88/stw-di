package twolak.springframework.stwdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import twolak.springframework.stwdi.services.ConstructorGreetingService;
import twolak.springframework.stwdi.services.PropertyGreetingService;

public class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;
    
    @BeforeEach
    public void setUp() throws Exception {
	propertyInjectedController = new PropertyInjectedController();
	propertyInjectedController.greetingService = new PropertyGreetingService();
    }
    
    @Test
    public void testGetGreeting() throws Exception {
	assertEquals("Hello World - Property", propertyInjectedController.getGreeting());
    }
}