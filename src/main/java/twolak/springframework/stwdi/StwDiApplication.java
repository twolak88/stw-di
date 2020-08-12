package twolak.springframework.stwdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import twolak.springframework.stwdi.controllers.ConstructorInjectedController;
import twolak.springframework.stwdi.controllers.I18nController;
import twolak.springframework.stwdi.controllers.MyController;
import twolak.springframework.stwdi.controllers.PropertyInjectedController;
import twolak.springframework.stwdi.controllers.SetterInjectedController;

@SpringBootApplication
@ComponentScan(basePackages = {"twolak.services", "twolak.springframework"})
//@ComponentScan(basePackages = {"twolak"})
public class StwDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(StwDiApplication.class, args);
		
		System.out.println("Ask for controller...");
		
		System.out.println("-----Primary Bean------");
		
		MyController controller = (MyController) applicationContext.getBean("myController");
		
		System.out.println(controller.getGreeting());
		
		System.out.println("-----Property------");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("-----Setter------");
		
		SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
		
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("-----Constructor------");
		
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		
		System.out.println(constructorInjectedController.getGreetings());
		
		System.out.println("-----Profiles------");
		
		I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
		
		System.out.println(i18nController.sayHello());
	}

}
