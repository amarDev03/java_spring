package java_spring.com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	private int id = 1;
	private String name = "Amar Goswami", gender = "Male";
	private int salary = 250000;
	
	@Autowired
	private Address address;
}
