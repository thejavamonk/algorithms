package com.codeprep.factorial;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number greater than or equal to zero: ");
		int input = scanner.nextInt();
		System.out.println("factorial of "+input+" is: "+factorial(input) );
		scanner.close();
	}
	
	private static Long factorial(int n) {
		
		if(n == 0) {
			return 1L;
		}
		return n * factorial(n - 1);
	}

}
