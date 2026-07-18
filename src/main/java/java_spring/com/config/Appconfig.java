package java_spring.com.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

	@Configuration
	@ComponentScan(basePackages = "java_spring.com")
	public class Appconfig {

		@Bean
		DataSource dataSource() {
			
			DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
			
			driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/mydb");
			driverManagerDataSource.setUsername("root");
			driverManagerDataSource.setPassword("8171");
			driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			
			return driverManagerDataSource;
		}
	}
