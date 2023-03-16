package com.eoi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String hello()
	{
		return "Hello world!";
	}

	@RequestMapping("/hola")
	String hola()
	{
		return "Hola mundo!";
	}
	@RequestMapping("/mimedicacion")
	String mimedicacion()
	{
		return "Tómate las pastillas";
	}
}



