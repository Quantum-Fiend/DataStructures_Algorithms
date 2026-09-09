package problem_solving_fundamentals;

import java.util.HashMap;

public class majorityElement {
	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap<>();

		int[] arr1 = { 3, 3, 4, 2, 3, 3, 3 };
		// Expected: 3

		// int[] arr2 = {2, 2, 1, 1, 1, 2, 2};
		// Expected: 2

		// int[] arr3 = {1, 1, 2, 1, 3, 1, 1};
		// Expected: 1

		// int[] arr4 = {1, 2, 3, 4};
		// Expected: -1

		// int[] arr5 = {5};
		// Expected: 5

		int n = arr1.length / 2;

		for (int arr : arr1) {
			map.put(arr, map.getOrDefault(arr, 0) + 1);
		}

		for (int arr : map.keySet()) {
			if (map.get(arr) > n) {
				System.out.println("Majority Element -> " + arr);
				return;
			}
		}
		System.out.println(-1);
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(n) ~ [ Linear ]