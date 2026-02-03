package com.codeprep.sumofdigits;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		long n = scanner.nextLong();
		System.out.println(sumDisgits(n));
		scanner.close();
	}
	
	private static long sumDisgits(long n) {
		
		if(n/10 == 0) {
			return n;
		}
		return sumDisgits(n / 10) + n%10;
	}

}
