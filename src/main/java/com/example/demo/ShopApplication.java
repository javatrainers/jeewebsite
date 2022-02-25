package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages= {"com.servlet"})
public class ShopApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(ShopApplication.class, args);
	}

}
