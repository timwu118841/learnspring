package com.tiwu.day4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EntityScan
public class Day4Application {

	public static void main(String[] args) {
		SpringApplication.run(Day4Application.class, args);
	}

}
