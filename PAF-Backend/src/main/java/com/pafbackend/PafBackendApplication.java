package com.pafbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.pafbackend.*"})
public class PafBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PafBackendApplication.class, args);
	}

}
