package com.codeprep.quicksort;

import java.util.Scanner;

public class Solution {

	public static void sort(int[] a, int n){
		
		sort(a, 0, n-1);
	}
	
	private static void sort(int a[], int low, int up){
		if(low >= up){
			return;
		}
		int p = partition(a, low, up);
		sort(a, low, p-1);
		sort(a, p+1, up);
	}
	
	private static int partition(int[] a, int low, int up){
		int temp, i, j, pivot;
		
		pivot = a[low];
		
		i = low + 1; // moves from left to right
		j = up;  // moves from right to left
		
		while(1 <= j){
			while(a[i] < pivot && i < up){
				i++;
			}
			
			while(a[j] > pivot){
				j--;
			}
			
			if(i < j){  // swap a[i] and a[j]
				
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
				
			}else{  // found proper place for pivot
				break;
			}
		}
		
		// proper place for pivot is j
		a[low] = a[j];
		a[j] = pivot;
		
		return j;
	}
	
	public static void main(String[] args){
		
		int i, n;
		int[] a = new int[20];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n = scan.nextInt();
		for(i = 0; i < n; i++){
			
			System.out.println("Enter element "+(i + 1)+" : ");
			a[i] = scan.nextInt();
		}
		
		sort(a, n);
		System.out.println("Sorted array is: ");
		
		for(i = 0; i < n; i++){
			System.out.println(a[i] + " ");
		}
		System.out.println();
		scan.close();
	}
}
