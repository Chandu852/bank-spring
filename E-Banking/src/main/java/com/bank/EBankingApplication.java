package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bank.controller.HomeController;

@SpringBootApplication
public class EBankingApplication {

	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(EBankingApplication.class, args);
		
		//creating the object of Home controller
		HomeController hc = container.getBean(HomeController.class);
		hc.bank();
	}
}
