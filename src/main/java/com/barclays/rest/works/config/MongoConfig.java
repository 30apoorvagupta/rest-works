package com.barclays.rest.works.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.barclays.rest.works.entity.Employee;
import com.barclays.rest.works.repo.EmployeeRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = EmployeeRepository.class)
public class MongoConfig {
	
	@Bean
	public CommandLineRunner commandLineRunner(EmployeeRepository repo) {
		//return string -> repo.insert(new Employee(101,"Harshitha",2233));
		//return string -> repo.insert(new Employee(102,"Apoorva",11333));
		return null;
	
	}
}
