package com.example.proper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ProperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProperApplication.class, args);
	}

}
