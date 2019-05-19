package com.paf.prj.PAF_1.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class CategoryApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CategoryApplication.class, args);
	}

}
