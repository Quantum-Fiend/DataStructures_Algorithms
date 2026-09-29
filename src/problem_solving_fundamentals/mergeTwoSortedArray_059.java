package problem_solving_fundamentals;

import java.util.Arrays;

public class mergeTwoSortedArray_059 {
	public static int[] mergeSortedArray(int[] arr1, int[] arr2) {

		int[] result = new int[arr1.length + arr2.length];

		int i = 0; // arr1 pointer
		int j = 0; // arr2 pointer
		int k = 0; // result pointer

		// Compare both arrays
		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] <= arr2[j]) {
				result[k] = arr1[i];
				i++;
			} else {
				result[k] = arr2[j];
				j++;
			}

			k++;
		}
		// arr1 ke remaining elements
		while (i < arr1.length) {
			result[k] = arr1[i];
			i++;
			k++;
		}
		// arr2 ke remaining elements
		while (j < arr2.length) {
			result[k] = arr2[j];
			j++;
			k++;
		}
		return result;
	}

	public static void main(String[] args) {

		// Test Case 1
		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 2, 4, 6 };
		System.out.println(Arrays.toString(mergeSortedArray(arr1, arr2)));
		// Expected: [1, 2, 3, 4, 5, 6]

		// Test Case 2
		// int[] arr1 = { 1, 2, 3 };
		// int[] arr2 = { 4, 5, 6 };
		// System.out.println(Arrays.toString(mergeSortedArray(arr1, arr2)));

		// Expected: [1, 2, 3, 4, 5, 6]

		// Test Case 3
		// int[] arr1 = { 2, 4, 6 };
		// int[] arr2 = { 1, 3, 5 };
		// System.out.println(Arrays.toString(mergeSortedArray(arr1, arr2)));

		// Expected: [1, 2, 3, 4, 5, 6]

		// Test Case 4
		// int[] arr1 = { 1, 1, 3 };
		// int[] arr2 = { 1, 2, 2 };
		// System.out.println(Arrays.toString(mergeSortedArray(arr1, arr2)));

		// Expected: [1, 1, 1, 2, 2, 3]

		// Test Case 5
		// int[] arr1 = {};
		// int[] arr2 = { 1, 2, 3 };
		// System.out.println(Arrays.toString(mergeSortedArray(arr1, arr2)));

		// Expected: [1, 2, 3]
	}
}
// Time Complexity = O(n + m) ~ [ Linear ]
// Space Complexity = O(n + m) ~ [ Linear ]