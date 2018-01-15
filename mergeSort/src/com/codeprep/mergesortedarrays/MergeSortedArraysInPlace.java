package com.codeprep.mergesortedarrays;

public class MergeSortedArraysInPlace {
	
	public static void merge(int[] a, int[] temp, int low1, int up1, int low2, int up2){
		
		int i = low1;
		int j = low2;
		int k = low1;
		
		while((i <= up1) && (j <= up2)){
			
			if(a[i] <= a[j]){
				temp[k++] = a[i++];
			}
			else{
				temp[k++] = a[j++];
			}
		}
		
		while (i <= up1) {
			temp[k++] = a[i++];
		}
		
		while (j <= up2) {
			temp[k++] = a[j++];
		}
	}

	public static void main(String[] args) {
		
		int [] a = {1, 3, 5, 7,  2, 4, 6, 9, 11, 14};
		int [] temp = new int[10];
		
		merge(a, temp, 0, 3, 4, 9);
		
		StringBuilder builder = new StringBuilder();
		for (int value : temp) {
			builder.append(value);
			builder.append(" ");
		}
		System.out.println(builder.toString());
	}

}
