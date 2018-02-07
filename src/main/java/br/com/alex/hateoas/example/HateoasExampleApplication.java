package br.com.alex.hateoas.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = SeedConfiguration.class)
public class HateoasExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HateoasExampleApplication.class, args);
	}
}
