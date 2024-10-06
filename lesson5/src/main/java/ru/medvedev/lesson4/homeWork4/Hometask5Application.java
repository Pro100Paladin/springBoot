package ru.medvedev.lesson4.homeWork4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ReaderProperties.class)
public class Hometask5Application {

	public static void main(String[] args) {
		SpringApplication.run(Hometask5Application.class, args);
	}

}
