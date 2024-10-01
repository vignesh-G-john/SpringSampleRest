package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



//@ComponentScan("com.example")
//@EnableJpaRepositories(basePackages = {"com.repository"})

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class SampleEntityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleEntityApplication.class, args);
	}

}
