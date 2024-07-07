package com.OntAirio.data_query_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.OntAirio.data_query_service")
@EnableJpaRepositories(basePackages = "com.OntAirio.data_query_service.repository")
@EntityScan(basePackages = "com.OntAirio.data_query_service.*")
public class DataQueryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataQueryServiceApplication.class, args);
	}

}
