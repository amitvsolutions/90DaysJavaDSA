package com.demo;

import java.time.LocalDate;
import java.util.Scanner;

public class CountAge {
	public static int currentYear= LocalDate.now().getYear();

	public static void main(String[] args) {
		printDetails();
	}

	private static String printDetails() {
		System.out.println("Please enter your name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Hi, "+name);
		
		System.out.println("In which year() you born? ");
		//Scanner scan = new Scanner(System.in);
		String year = scan.nextLine();
		int age = currentYear - Integer.parseInt(year);
		System.out.println("Ok "+name +", your age is "+ age);		
		
		scan.close();
		return "";
	}



}
