package com.jk.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 88a20c3 (second commit)

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
