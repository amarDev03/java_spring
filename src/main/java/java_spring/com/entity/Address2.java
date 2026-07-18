package java_spring.com.entity;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Address2 implements AddInterface{
	
	private String city = "Noida", state = "UP";

}
