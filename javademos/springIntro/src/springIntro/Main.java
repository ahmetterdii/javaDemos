package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		
		customerService.add();
	}
	
	//IoC - Inversion of Control
	//IoC ile birbirinin alternatifi olan i�ler y�r�t�lebilir.(Ayr� classlarda)
	//Bu yap�y� aya�a kald�ran tasar�m deseninin ad� Dependency Injeciton
}
