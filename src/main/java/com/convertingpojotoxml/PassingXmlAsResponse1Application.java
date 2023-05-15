package com.convertingpojotoxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.convertingpojotoxml", "Controller"})
public class PassingXmlAsResponse1Application {

	public static void main(String[] args) {
		SpringApplication.run(PassingXmlAsResponse1Application.class, args);
	}

}
