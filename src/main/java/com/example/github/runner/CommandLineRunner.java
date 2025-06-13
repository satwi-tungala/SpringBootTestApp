package com.example.github.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.github.model.MessageRunner;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {
    private static Logger log= LoggerFactory.getLogger(MessageRunner.class);
	@Override
	public void run(String... args) throws Exception {
	int a = 10;
	try {
		log.info("Started");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		System.out.println("WELCOME TO SPRING BOOT"+a);
    log.info("Ended");
	}
   
}
