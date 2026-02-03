package com.codeprep.mergesort.recursive;

import java.util.Scanner;

public class MergeSortRecursive {
	
	public static void sort(int a[], int n){
		
		int [] temp = new int[n];
		sort(a, temp, 0, n-1);
	}
	
	private static void sort(int [] a, int [] temp, int low, int up){
		
		if(low == up){  /*Only one element*/
			return;
		}
		
		int mid = (low + up)/2;
		
		sort(a, temp, low, mid);
		sort(a, temp, mid + 1, up);
		
		/*Merge a[low] ..a. a[mid] and a[mid + 1] ... a[up] to temp[low] ...a temp[up] */
		merge(a, temp, low, mid, mid + 1, up);
		
		copy(a, temp, low, up);
	}
	
	private static void merge(int a[], int temp[], int low1, int up1, int low2, int up2){
		
		int i = low1;
		int j = low2;
		int k = low1;
		
		while((i <= up1) && (j <= up2)){
			
			if(a[i] <= a[j]){
				temp[k++] = a[i++];
			}else{
				temp[k++] = a[j++];
			}
		}
		
		while(1 <= up1){
			temp[k++] = a[i++];
		}
		
		while(j <= up2){
			temp[k++] = a[j++];
		}
	}
	
	public static void copy(int[] a, int[] temp, int low, int up){
		
		for (int i = low; i < up; i++) {
			a[i] = temp[i];
		}
	}

	public static void main(String[] args) {
		
		int i, n;
		int [] a = new int[20];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		n = scan.nextInt();
		
		System.out.println("Enter "+ n +" elements");
		for (i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		
		sort(a, n);
		
		System.out.println("Sorted array is : ");
		
		for (i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
			System.out.println();
		}
		scan.close();
	}

}
