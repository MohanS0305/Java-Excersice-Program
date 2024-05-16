package com.java.excersice;

import java.util.Scanner;

/*  1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
		Test Data
		Input a degree in Fahrenheit: 212
		Expected Output:
		212.0 degree Fahrenheit is equal to 100.0 in Celsius */

public class Program_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any no :");
		int f = input.nextInt();
		double c = ((f-32)*5)/9;
		System.out.println(f+" degree fahrenheit is equal to "+c+" in celsius");
		input.close();
		
		}
}
