package com.springbootdemo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
public class Main {

	@Value("${FirstName}")
	String name;
	@RequestMapping("/hello")
	String home() {
		return "Hello World!" + name;
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
