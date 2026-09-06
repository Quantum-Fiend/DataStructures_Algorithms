package problem_solving_fundamentals;

import java.util.HashMap;

public class findFirstAppearElement {
	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap<>();

		int[] arr1 = { 4, 5, 1, 2, 1, 4, 5 };
		// Expected: 2

		// int[] arr2 = {1, 1, 2, 2, 3};
		// Expected: 3

		// int[] arr3 = {7, 7, 7, 8, 8, 9};
		// Expected: 9

		// int[] arr4 = {1, 2, 3, 4};
		// Expected: 1

		// int[] arr5 = {5, 5, 6, 6, 5};
		// Expected: 6

		for (int arr : arr1) {
			map.put(arr, map.getOrDefault(arr, 0) + 1);
		}
		for (int arr : arr1) {
			if (map.get(arr) == 1) {
				System.out.println("First Non~Repeating Element : " + arr);
				break;
			}
		}
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(n) ~ [ Linear ]