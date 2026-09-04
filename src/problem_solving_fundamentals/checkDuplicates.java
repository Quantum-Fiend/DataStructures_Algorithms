package problem_solving_fundamentals;

import java.util.HashMap;

public class checkDuplicates {
	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap<>();

		// Test Case 1: Duplicate in the middle
		int[] arr1 = { 1, 2, 3, 2, 4 };
		// Expected: true
		// Duplicate: 2

		// Test Case 2: No duplicates
		// int[] arr2 = { 1, 2, 3, 4, 5 };
		// Expected: false
		// Duplicate: none

		// Test Case 3: All elements are same
		// int[] arr3 = { 7, 7, 7, 7 };
		// Expected: true
		// Duplicate: 7

		// Test Case 4: Duplicate at the beginning
		// int[] arr4 = { 5, 5, 1, 2, 3 };
		// Expected: true
		// Duplicate: 5

		// Test Case 5: Empty / single-element array
		// int[] arr5 = {};
		// Expected: false
		// Duplicate: none

		for (int arr : arr1) {
			map.put(arr, map.getOrDefault(arr, 0) + 1);
		}

		for (int arr : map.keySet()) {
			if (map.get(arr) > 1) {
				System.out.println("Duplicates : " + arr);
			}
		}
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(n) ~ [ Linear ]