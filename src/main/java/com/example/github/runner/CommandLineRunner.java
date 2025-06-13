package com.example.github.runner;

import org.springframework.stereotype.Component;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("WELCOME TO SPRING BOOT");
		System.out.println("WELCOME TO SPRING BOOT");
	}

}
