package com.java.excersice;

import java.util.Scanner;

/* 5. Write a Java program that accepts two integers from the user and then prints the sum,
		the difference, the product, the average, the distance (the difference between integer),
		the maximum (the larger of the two integers), the minimum (smaller of the two integers).
		Test Data
		Input 1st integer: 25
		Input 2nd integer: 5
		Expected Output
		Sum of two integers: 30
		Difference of two integers: 20
		Product of two integers: 125
		Average of two integers: 15.00
		Distance of two integers: 20
		Max integer: 25
		Min integer: 5 */
public class Program_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first no:");
		int a = input.nextInt();
		System.out.println("Enter the second no:");
		int b = input.nextInt();
		
		// sum of two integer
		System.out.println("sum of two integer is : "+(a+b));
		
		//Difference of two integer
		int c = a-b;
		System.out.println("Difference of two integer is : "+c);
		
		//Product of two numbers
		System.out.println("Product of two numbers is : "+a*b);
		
		//Average of two numbers
		System.out.println("Average of two numbers is : "+(double) (a+b)/2);
		
		//Distance of two numbers
		System.out.println("Distance of two numbers is : "+c);
		
		//max integer of two number
		if(a>b) {
			System.out.println("Maximum of two integer is : "+a);
		} 
		if(b<a)
			System.out.println("Minimum of two integer is : "+b);
		input.close();
	}
}
