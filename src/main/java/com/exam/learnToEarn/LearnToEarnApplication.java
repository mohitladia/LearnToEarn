package com.exam.learnToEarn;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearnToEarnApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnToEarnApplication.class, args);
	}
	@RequestMapping(value="/greeting",method= GET)
	public String sayHello() {
		return "mohit";
	}
	
}
