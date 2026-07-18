package java_spring.com.entity;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	private int id;
	private String name;
	private int salary;
	
}
