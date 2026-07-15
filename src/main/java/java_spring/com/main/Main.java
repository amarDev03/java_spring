package java_spring.com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java_spring.com.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee bean = ioc.getBean("emp1", Employee.class);
		
		System.out.println(bean);
		
		Employee bean2 = ioc.getBean("emp2",Employee.class);
		
		System.out.println(bean2);
		
		Employee bean3 = ioc.getBean("emp3",Employee.class);
		
		System.out.println(bean3);
	}
}
