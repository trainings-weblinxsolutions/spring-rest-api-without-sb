package com.saliljavatrainings.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	private Logger logger = Logger.getLogger(WelcomeController.class);
	private Logger logger2 = LogManager.getLogger(WelcomeController.class);
	 
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
    	System.out.println("In the greet method!");
        String greet = "Hello!!! " + name + " How are You?";
        logger.info(greet);
        return greet;
    }
}
