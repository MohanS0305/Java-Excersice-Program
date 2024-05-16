package com.java.excersice;

import java.util.Scanner;

/* 4. Write a Java program to break an integer into a sequence of individual digits
		Test Data
		Input six non-negative digits: 123456
		Expected Output
		1 2 3 4 5 6  */
public class Program_04 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter any no:");
			int n = input.nextInt();
			String str = ""+n;
			
			for(int i=0; i<str.length(); i++) {
				System.out.print(str.charAt(i)+" ");
			}
			input.close();
		}
}
