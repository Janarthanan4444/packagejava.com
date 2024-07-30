package com.internship;

import java.util.Arrays;

public class ArrayDuplicateExample {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6 };

		int unqiueno = arr.length;
		for (int i = 0; i < unqiueno; i++) {
			for (int j = i + 1; j < unqiueno; j++) {
				if (arr[i] == arr[j]) {

					arr[j] = arr[unqiueno - 1];
					unqiueno--;
					j--;
				}
			}
		}
		int copy[] = Arrays.copyOf(arr, unqiueno);
		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]);
		}
	}

}
