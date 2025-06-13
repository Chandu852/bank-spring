package com.bank.services;

import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class BankBalance {
	
	public double balance = 0;
	
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your amount");
		double amt = sc.nextDouble();
		balance = balance + amt;
		System.out.println(amt+ " credit to account successfully");
	}
	
	
	public void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount that you want to withdraw");
		double amt = sc.nextDouble();
		
		if(amt<=balance) {
			balance = balance-amt;
			System.out.println(amt+ " is debited successfully");
		}
		else {
			System.out.println("Your withdrawn amount exceeds your current balance");
		}
		

	}
}















