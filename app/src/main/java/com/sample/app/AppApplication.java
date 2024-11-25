package com.sample.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

    @Bean
    public CommandLineRunner run() {
        return args -> {
            System.out.println("Application started successfully!");
            // Add custom startup logic here
        };
    }

}



