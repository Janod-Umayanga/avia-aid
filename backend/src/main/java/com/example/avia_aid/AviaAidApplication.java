package com.example.avia_aid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class AviaAidApplication {

	public static void main(String[] args) {
		SpringApplication.run(AviaAidApplication.class, args);
	}

}
