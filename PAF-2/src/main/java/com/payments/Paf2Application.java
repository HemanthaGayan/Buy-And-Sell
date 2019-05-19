package com.payments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Paf2Application {

	public static void main(String[] args) {
		SpringApplication.run(Paf2Application.class, args);
	}

}
