package com.codeprep.binarysearch;

import java.util.Scanner;

public class BinarySearch {
	
	public static int search(int [] a, int n, int searchValue){
		
		int first = 0, last = n -1, mid;
		
		while(first <= last){
			
			mid = (first + last) / 2;
			
			if(searchValue < a[mid]){
				last = mid - 1;
			}
			else if (searchValue > a[mid]){
				first = mid + 1;
			}
			else{
				return mid;
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
		
		System.out.println("Enter the elements in a sorted order - ");
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
