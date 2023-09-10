package com.project.springApp;

import com.project.springApp.model.Employee;
import com.project.springApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee=new Employee();
		employee.setFirstName("Sriram");
		employee.setLastName("Adithya");
		employee.setEmailId("sriramadithya@gmail.com");
		employeeRepository.save(employee);

		Employee employee1=new Employee();
		employee1.setFirstName("Leo");
		employee1.setLastName("Messi");
		employee1.setEmailId("leomessi@gmail.com");
		employeeRepository.save(employee1);


	}
}
