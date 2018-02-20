package in.co.person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetterInjection {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext(
				"resources/spring.xml");

		Person p = (Person) app.getBean("P");

		p.hello("Tarun");

	}

}
