package com.codeprep.selectionsort;

import java.util.Scanner;

public class SelectionSort {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = scanner.nextInt();

		int[] arrayToBeSorted = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the values of the elements: ");
			arrayToBeSorted[i] = scanner.nextInt();
		}

		int[] sortedArray = selectionSort(arrayToBeSorted, n);
		String sortedElements = "";

		for (int i : sortedArray) {
			sortedElements = sortedElements + i + " ";
		}
		System.out.println(sortedElements);
	}

	public static int[] selectionSort(int[] arrayToBeSorted, int size) {

		int minIndex, temp, i, j;

		for (i = 0; i < size - 1; i++) {
			minIndex = i;
			for (j = i + 1; j < size; j++) {
				if (arrayToBeSorted[j] < arrayToBeSorted[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				temp = arrayToBeSorted[i];
				arrayToBeSorted[i] = arrayToBeSorted[minIndex];
				arrayToBeSorted[minIndex] = temp;
			}
		}
		return arrayToBeSorted;
	}

}
