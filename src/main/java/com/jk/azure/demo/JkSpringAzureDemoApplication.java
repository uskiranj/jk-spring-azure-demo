package com.jk.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JkSpringAzureDemoApplication {

	@GetMapping("/hello")
	public String message()
	{
		return "Hello First azure spring app redeployed";
	}

	public static void main(String[] args) {
		SpringApplication.run(JkSpringAzureDemoApplication.class, args);
	}

}
