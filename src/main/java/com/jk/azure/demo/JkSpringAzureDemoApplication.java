package com.jk.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class JkSpringAzureDemoApplication {

	@GetMapping("/hello")
	public String message()
	{
		return "Hello First azure spring app";
	}

	public static void main(String[] args) {
		SpringApplication.run(JkSpringAzureDemoApplication.class, args);
	}

}
