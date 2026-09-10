package problem_solving_fundamentals;

import java.util.HashSet;

public class findIntersection {
	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();
		// Test Case 1
		int[] arr1 = { 1, 2, 2, 3, 4 };
		int[] arr2 = { 2, 2, 4, 5 };
		// Expected: [2, 4]

		// Test Case 2
		// int[] arr1 = { 1, 1, 1, 2, 3 };
		// int[] arr2 = { 1, 1, 4, 5 };
		// Expected: [1]

		// Test Case 3
		// int[] arr1 = { 7, 8, 9 };
		// int[] arr2 = { 1, 2, 3 };
		// Expected: []

		// Test Case 4
		// int[] arr1 = { 5, 5, 6, 7, 8 };
		// int[] arr2 = { 8, 7, 7, 5 };
		// Expected: [5, 7, 8]

		// Test Case 5
		// int[] arr1 = { 10 };
		// int[] arr2 = { 10 };
		// Expected: [10]

		for (int arr : arr1) {
			set.add(arr);
		}
		for (int arr : arr2) {
			if (set.contains(arr)) {
				System.out.print(arr + " ");
				set.remove(arr);
			}
		}
	}
}
// Time Complexity = O(n + m) ~~ [ Linear ]
// Space Complexity = O(n) ~~ [ Linear ]
