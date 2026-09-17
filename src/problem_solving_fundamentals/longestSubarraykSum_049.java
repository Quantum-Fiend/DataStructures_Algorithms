package problem_solving_fundamentals;

import java.util.HashMap;

public class longestSubarraykSum_049 {
	public static int longestSubarrayWithSumK(int[] arr, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);

		int prefixSum = 0;
		int maxLength = 0;

		for (int i = 0; i < arr.length; i++) {
			prefixSum += arr[i];

			int required = prefixSum - k;

			if (map.containsKey(required)) {
				int previousIndex = map.get(required);
				int length = i - previousIndex;
				maxLength = Math.max(maxLength, length);
			}
			if (!map.containsKey(prefixSum)) {
				map.put(prefixSum, i);
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {

		// Test Case 1
		int[] arr = { 10, 5, 2, 7, 1, 9 };
		int k = 15;
		System.out.println(longestSubarrayWithSumK(arr, k));
		// Expected: 4

		// Test Case 2
		// int[] arr = { 1, 2, 3, 4, 5 };
		// int k = 9;
		// System.out.println(longestSubarrayWithSumK(arr, k));
		// Expected: 2

		// Test Case 3
		// int[] arr = { -1, -2, 3, 4, -2, 5 };
		// int k = 5;
		// System.out.println(longestSubarrayWithSumK(arr, k));
		// Expected: 4

		// Test Case 4
		// int[] arr = { 2, 3, 1, 2, 4, 3 };
		// int k = 7;
		// System.out.println(longestSubarrayWithSumK(arr, k));
		// Expected: 3

		// Test Case 5
		// int[] arr = { 1, -1, 5, -2, 3 };
		// int k = 3;
		// System.out.println(longestSubarrayWithSumK(arr, k));
		// Expected: 4
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(n) ~ [ Linear ]