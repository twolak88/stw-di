package twolak.springframework.stwdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getEnglishGreeting() {
	return "Hello World - EN";
    }

    @Override
    public String getPolishGreeting() {
	return "Witaj Świecie - PL";
    }

    @Override
    public String getSpanishGreeting() {
	return "Hola Mundo - ES";
    }

}
