package problem_solving_fundamentals;

import java.util.HashSet;

public class findDifferenceBetweenArrays_048 {
	public static void main(String[] args) {

		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		// Test Case 1
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 2, 4, 5 };
		// Expected symmetric difference: [1, 3, 5]

		// Test Case 2
		// int[] arr1 = { 10, 20, 30 };
		// int[] arr2 = { 20, 30, 40, 50 };
		// Expected symmetric difference: [10, 40, 50]

		// Test Case 3
		// int[] arr1 = { 1, 2, 3 };
		// int[] arr2 = { 1, 2, 3 };
		// Expected symmetric difference: []

		// Test Case 4
		// int[] arr1 = { 5, 7, 9, 11 };
		// int[] arr2 = { 5, 8, 9, 12 };
		// Expected symmetric difference: [7, 8, 11, 12]

		// Test Case 5
		// int[] arr1 = { 1, 1, 2, 3 };
		// int[] arr2 = { 2, 3, 4, 4 };
		// Expected symmetric difference: [1, 4]

		for (int a1 : arr1)
			set1.add(a1);
		for (int a2 : arr2)
			set2.add(a2);
	}
}
