package com.java.excersice;

import java.util.Scanner;

/* 2. Write a Java program to convert minutes into a number of years and days.
		Test Data
		Input the number of minutes: 3456789
		Expected Output
		3456789 minutes is approximately 6 years and 210 days */

public class Program_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any no in minutes :");
		int minutes = input.nextInt();
		int day = minutes/60/24; // minutes to days
		int year = day/365;
		int remainingDay = day % 365; // day remainder year = remainderday
		System.out.println(minutes+" minutes is approximately "+year+" years and "+remainingDay+" days");
		input.close();
	}

}
