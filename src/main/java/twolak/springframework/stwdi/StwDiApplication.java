package twolak.springframework.stwdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import twolak.springframework.stwdi.controllers.ConstructorInjectedController;
import twolak.springframework.stwdi.controllers.GreetingController;
import twolak.springframework.stwdi.controllers.MyController;
import twolak.springframework.stwdi.controllers.PropertyInjectedController;
import twolak.springframework.stwdi.controllers.SetterInjectedController;
import twolak.springframework.stwdi.examplebeans.FakeDataSource;

@SpringBootApplication
//@ComponentScan(basePackages = {"twolak.services", "twolak.springframework"})
//@ComponentScan(basePackages = {"twolak"})
public class StwDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(StwDiApplication.class, args);
		
		System.out.println("-----Primary Bean------");
		
		MyController controller = (MyController) applicationContext.getBean("myController");
		
		FakeDataSource fakeDataSource = (FakeDataSource) applicationContext.getBean(FakeDataSource.class);
		
		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getUrl());
		
//		System.out.println(controller.getGreeting());
//		
//		System.out.println("-----Property------");
//		
//		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
//		
//		System.out.println(propertyInjectedController.getGreeting());
//		
//		System.out.println("-----Setter------");
//		
//		SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
//		
//		System.out.println(setterInjectedController.getGreeting());
//		
//		System.out.println("-----Constructor------");
//		
//		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
//		
//		System.out.println(constructorInjectedController.getGreetings());
//		
//		System.out.println("-----Profiles------");
//		
//		GreetingController greetingController = (GreetingController) applicationContext.getBean("greetingController");
//		
//		System.out.println(greetingController.sayHello());
	}

}
