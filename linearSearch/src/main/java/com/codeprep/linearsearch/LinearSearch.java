package com.codeprep.linearsearch;

import java.util.Scanner;

public class LinearSearch {
	
	private LinearSearch(){
		
	}
	
	public static int search(int [] a, int n, int searchValue){
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == searchValue){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int i, n, searchValue, index;
		int [] a = new int [100];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		n = scanner.nextInt();
		
		System.out.println("Enter the elements - ");
		for(i = 0; i < n; i ++){
			a[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the search value : ");
		searchValue = scanner.nextInt();
		
		index = search(a, n, searchValue);
		
		if(index == -1){
			System.out.println("Value "+searchValue +" not present in the array");
		}
		else{
			System.out.println("Value "+searchValue+ " present at index "+index);
		}
		scanner.close();
	}

}
