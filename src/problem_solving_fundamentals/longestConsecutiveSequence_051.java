package problem_solving_fundamentals;

import java.util.HashSet;

public class longestConsecutiveSequence_051 {
	public static int longestConsecutiveSequence(int[] arr) {

		HashSet<Integer> set = new HashSet<>();

		for (int num : arr)
			set.add(num);

		int longestLength = 0;

		for (int num : set) {
			if (!set.contains(num - 1)) {
				int currentNumber = num;
				int currentLength = 1;

				while (set.contains(currentNumber + 1)) {
					currentNumber++;
					currentLength++;
				}

				longestLength = Math.max(longestLength, currentLength);
			}
		}

		return longestLength;
	}

	public static void main(String[] args) {

		// Test Case 1
		int[] arr = { 100, 4, 200, 1, 3, 2 };
		System.out.println(longestConsecutiveSequence(arr));
		// Expected: 4

		// Test Case 2
		// int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
		// System.out.println(longestConsecutiveSequence(arr));
		// Expected: 9

		// Test Case 3
		// int[] arr = {1, 2, 0, 1};
		// System.out.println(longestConsecutiveSequence(arr));
		// Expected: 3

		// Test Case 4
		// int[] arr = {9, 1, 4, 7, 3, 2, 6, 5};
		// System.out.println(longestConsecutiveSequence(arr));
		// Expected: 7

		// Test Case 5
		// int[] arr = {};
		// System.out.println(longestConsecutiveSequence(arr));
		// Expected: 0
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(n) ~ [ Linear ]