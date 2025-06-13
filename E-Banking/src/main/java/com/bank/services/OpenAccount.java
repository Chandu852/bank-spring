package com.bank.services;

import java.util.Scanner;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class OpenAccount {
	
	public String name;
	public int ac_no;
	public void account() {
		
		Random r = new Random();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.nextLine();
		System.out.println("Enter your Age");
		int age = sc.nextInt();
		ac_no = 10000 + r.nextInt(90000);
		
	}
}
