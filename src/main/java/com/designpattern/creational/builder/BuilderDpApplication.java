package com.designpattern.creational.builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderDpApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuilderDpApplication.class, args);

		Person person = new PersonBuilder()
								.works()
									.at("Google")
									.as("Developer")
									.earning(200000)
								.lives()
									.at("Bakers Street")
									.in("London")
									.withPostCode("GBL 25Q")
								.build();
		System.out.println(person);
	}
}
