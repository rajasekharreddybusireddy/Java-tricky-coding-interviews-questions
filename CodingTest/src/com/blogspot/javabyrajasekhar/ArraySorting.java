package com.blogspot.javabyrajasekhar;

public class ArraySorting {

	public static void main(String[] args) {
		int array[] = new int[] { 10, 70, 9, 7, 66, 55, 435, 765, 234 };
		customArraySort(array);
	}

	private static void customArraySort(int[] array) {

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {
					int a = array[i];
					array[i] = array[j];
					array[j] = a;
				}
			}
			System.out.println(array[i]);
		}

	}

}
