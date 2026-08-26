package problem_solving_fundamentals;

import java.util.Arrays;

public class reverseArray {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 }; // Test Case 1

		// int[] arr2 = { -1, -2, -3, -4 }; // Test Case 2

		// int[] arr3 = { 10, 20, 30, 40, 50, 60 }; // Test Case 3

		for (int i = 0; i < arr1.length / 2; i++) {
			int reverseArray = arr1[i];
			arr1[i] = arr1[arr1.length - i - 1];
			arr1[arr1.length - i - 1] = reverseArray;
		}

		// Print Using For Loop
		// for (int i = 0; i < arr1.length; i++) {
		// System.out.println(arr1[i]);
		// }

		// Print Using Arrays.toString
		System.out.println(Arrays.toString(arr1));
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(1) ~ [ Constant ]
