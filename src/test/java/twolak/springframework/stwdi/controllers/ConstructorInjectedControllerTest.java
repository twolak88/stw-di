package twolak.springframework.stwdi.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.Generated;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import twolak.services.ConstructorGreetingService;

@Generated(value = "org.junit-tools-1.1.0")
public class ConstructorInjectedControllerTest {
    
    ConstructorInjectedController constructorInjectedController;
    
    @BeforeEach
    public void setUp() throws Exception {
	constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingService());
    }
    
    @Test
    public void testGetGreetings() throws Exception {
	assertEquals("Hello World - Constructor", constructorInjectedController.getGreetings());
    }
}