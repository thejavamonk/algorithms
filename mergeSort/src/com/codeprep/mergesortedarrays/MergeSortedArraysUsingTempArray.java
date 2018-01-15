package com.codeprep.mergesortedarrays;

import java.util.Scanner;

public class MergeSortedArraysUsingTempArray {
	
	public static void merge(int[] a1, int[] a2, int[] temp, int n1, int n2){
		
		int i = 0, j = 0, k = 0;
		
		while((i <= n1 - 1) && (j <= n2 - 1)){
			
			if(a1[i] < a2[j]){
				temp[k++] = a1[i++];
			}else{
				temp[k++] = a2[j++];
			}
		}
		
		/*copy remaining elements of a1 when a2 array is finished*/
		while(i <= n1 - 1){
			temp[k++] = a1[i++];
		}
		
		/*copy remaining elements of a2 when a1 array is finished*/
		while (j <= n2 - 1) {
			temp[k++] = a2[j++];
		}
	}
	
	public static void main(String[] args) {
		
		int i, n1, n2;
		int[] a1 = new int[20];
		int[] a2 = new int[20];
		int[] temp = new int[40];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in array a1 :");
		n1 = scanner.nextInt();
		System.out.println("Enter elements in sorted order : ");
		for (i = 0; i < n1; i++) {
			a1[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the number of elements in array a2 :");
		n2 = scanner.nextInt();
		System.out.println("Enter elements in sorted order : ");
		for (i = 0; i < n2; i++) {
			a2[i] = scanner.nextInt();
		}
		
		merge(a1, a2, temp, n1, n2);
		
		System.out.println("Merged array temp is :");
		StringBuilder builder = new StringBuilder();
		for (int value : temp) {
			builder.append(value);
		}
		System.out.println(builder.toString());
		scanner.close();
	}

}
