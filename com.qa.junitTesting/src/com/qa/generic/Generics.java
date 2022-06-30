package com.qa.generic;

public class Generics {

	public static <T> void printArray(T[] inputArray) {

		for (T generic : inputArray) {
			System.out.printf("%s ", generic);
		}
		System.out.println();
	}

	public static void main(String args[]) {

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'G', 'E', 'N', 'E', 'R', 'I', 'C', 'S' };
		Float[] floatArray = { 1.3f, 2.9f, 3.4f, 4.2f };

		System.out.println("Array integerArray contains:");
		printArray(intArray);
		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray);
		System.out.println("\nArray characterArray contains:");
		printArray(charArray);
		System.out.println("\nArray floatArray contains");
		printArray(floatArray);
	}
}