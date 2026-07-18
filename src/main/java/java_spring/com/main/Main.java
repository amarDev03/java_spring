package java_spring.com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java_spring.com.config.Appconfig;
import java_spring.com.dao.EmployeeDao;
import java_spring.com.dao.EmployeeDaoImpl;
import java_spring.com.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
			ApplicationContext app = new AnnotationConfigApplicationContext(Appconfig.class);
			
			EmployeeDao edao = app.getBean(EmployeeDaoImpl.class);
			
			Employee emp = new Employee(568, "Amar Giri", 250000);
			
	    	edao.saveEmployee(emp);
	    	System.out.println("save successfully");

//			emp = new Employee(6, "Arjun", 70_000);
//	    	edao.updateEmployee(emp);
//	    	System.out.println("updated successfully");

//	    	edao.deleteEmployee(emp);
//			List<Employee> allEmp=edao.getAllEmp();
//			
//			for (Employee employee : allEmp) {
//				System.out.println(employee);
//			}
			System.out.println("updated successfully");

	}
}
