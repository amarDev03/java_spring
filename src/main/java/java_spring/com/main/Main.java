package java_spring.com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java_spring.com.entity.Address1;
import java_spring.com.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ioc = new AnnotationConfigApplicationContext("java_spring.com.entity");
		
		Employee bean = ioc.getBean("employee", Employee.class);
		
		System.out.println(bean);
		
		System.out.println("===================================================================================================");		
		
		Address1 address = ioc.getBean(Address1.class);
		
		System.out.println(address);
	
	}
}
