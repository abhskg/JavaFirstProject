package week7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpContainer {

	@Bean
	public Employee emp4() {
		return new Employee("E11", "Jason", 15);
	}

	@Bean
	public Employee emp5() {
		return new Employee("E12", "Johnson", 17);
	}

	@Bean
	public Employee emp6() {
		Employee emp = new Employee();
		emp.setCode("E13");
		emp.setName("Jackson");
		emp.setAge(13);
		return emp;
	}
}
