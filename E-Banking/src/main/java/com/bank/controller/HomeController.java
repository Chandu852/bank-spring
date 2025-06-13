package com.bank.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bank.services.BankBalance;
import com.bank.services.OpenAccount;

@Controller
public class HomeController {
	
	@Autowired
	private OpenAccount acc;
	@Autowired
	private BankBalance bb;
	
	public void bank() {
		
		int i=0;
		
		while(i==0) {
			System.out.println("Choose your option");
			System.out.println("======================");
			System.out.println("1: Open your account");
			System.out.println("2: Exit");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1: i=2;
						acc.account();
						break;
						
				case 2: System.out.println("You are exitted");
						i=3;
						break;
				
				default: System.out.println("Wrong input");
			}
		}
		
		while(i==2){
			System.out.println("=======================");
			System.out.println("Welcome: "+ acc.name +" a/c no: "+ acc.ac_no);
			System.out.println("------------------------");
			System.out.println("1: Check your balance");
			System.out.println("2: Deposit Amount");
			System.out.println("3: Withdraw Amount");
			System.out.println("4: Exit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1: System.out.println("Your bank balance is "+ bb.balance);
						break;
						
				case 2: bb.deposit();
						break;
						
				case 3: bb.withdraw();
						break;
				
				case 4: System.out.println("Thanks "+ acc.name +" for choosing us as your bank");
						i++;
						break;
				
				default: System.out.println("Wrong choice");
			}
		}
		

	}
}










