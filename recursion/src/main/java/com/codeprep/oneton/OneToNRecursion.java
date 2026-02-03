package com.codeprep.oneton;

import java.util.Scanner;

public class OneToNRecursion {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of n : ");
		int input = scanner.nextInt();
		
		print1(input);
		System.out.println();
		
		print2(input);
		System.out.println();
		scanner.close();
	}
	
	public static void print1(int n) {
		
		if(n == 0) {
			return;
		}
		System.out.print(n + " ");
		print1(n -1);
	}
	
	public static void print2(int n) {
		
		if(n == 0) {
			return;
		}
		print2(n -1);
		System.out.print(n + " ");
	}
}
