package problem_solving_fundamentals;

import java.util.HashSet;

public class findFirstAppearTwice_042 {
	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();

		int[] arr1 = { 2, 1, 3, 5, 3, 2 };
		// Expected: 3

		// int[] arr2 = { 1, 2, 3, 4, 5 };
		// Expected: -1

		// int[] arr3 = { 1, 2, 3, 2, 1 };
		// Expected: 2

		// int[] arr4 = { 5, 4, 5, 4, 3 };
		// Expected: 5

		// int[] arr5 = { 7, 1, 9, 7, 1, 9 };
		// Expected: 7

		for (int arr : arr1) {

			if (set.contains(arr)) {
				System.out.print(arr + " ");
				break;
			} else
				set.add(arr);
		}
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(n) ~ [ Linear ]
