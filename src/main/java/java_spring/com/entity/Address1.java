package java_spring.com.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Primary
public class Address1 implements AddInterface {
	
	private String city = "Meerut", state = "UP";
}