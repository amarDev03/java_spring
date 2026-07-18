package java_spring.com.dao;

import java.util.List;
import java_spring.com.entity.Employee;

public interface EmployeeDao {
	
	public List<Employee> getAllEmp();
	public int saveEmployee(Employee e );
	public int updateEmployee(Employee e);
	public int deleteEmployee(Employee e);


}
