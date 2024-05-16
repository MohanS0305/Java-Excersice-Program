package com.java.excersice;

import java.util.Scanner;

/* 3. Write a Java program to compute body mass index (BMI).
		Test Data
		Input weight in pounds: 452
		Input height in inches: 72
		Expected Output:
		Body Mass Index is 61.30159143458721 */

public class Program_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight in pounds:");
		double weight = input.nextDouble();
		System.out.println("Enter the height in centimeter:");
		double height = input.nextDouble();
		
		double bmi = weight*0.4535/(height*0.0254*height*0.0254);
		System.out.println("Your bmi is : "+bmi);
		input.close();
	}

}
