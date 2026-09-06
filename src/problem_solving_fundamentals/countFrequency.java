package problem_solving_fundamentals;

import java.util.HashMap;

public class countFrequency {
	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap<>();

		int[] arr1 = { 1, 2, 2, 3, 1, 1, 4 };
		// Expected: 1 -> 3, 2 -> 2, 3 -> 1, 4 -> 1

		// int[] arr2 = {5, 5, 5, 5};
		// Expected: 5 -> 4

		// int[] arr3 = {1, 2, 3, 4, 5};
		// Expected: 1 -> 1, 2 -> 1, 3 -> 1, 4 -> 1, 5 -> 1

		// int[] arr4 = {};
		// Expected: Empty frequency map

		// int[] arr5 = {-1, 2, -1, 2, 2, 0};
		// Expected: -1 -> 2, 2 -> 3, 0 -> 1

		for (int arr : arr1) {
			map.put(arr, map.getOrDefault(arr, 0) + 1);
		}

		for (int key : map.keySet()) {
			System.out.println(key + " -> " + map.get(key));
		}
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(n) ~ [ Linear ]