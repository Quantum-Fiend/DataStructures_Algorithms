package problem_solving_fundamentals;

import java.util.HashMap;

public class subArraySumEqualsK_050 {
	public static int subArraySumEqualsK(int[] arr, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);

		int prefixSum = 0;
		int count = 0;

		for (int num : arr) {
			prefixSum += num;

			int required = prefixSum - k;

			if (map.containsKey(required))
				count += map.get(required);

			map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
		}
		return count;
	}

	public static void main(String[] args) {

		// Test Case 1
		int[] arr = { 1, 1, 1 };
		int k = 2;
		System.out.println(subArraySumEqualsK(arr, k));
		// Expected: 2

		// Test Case 2
		// int[] arr = { 1, 2, 3 };
		// int k = 3;
		// System.out.println(subArraySumEqualsK(arr, k));
		// Expected: 2

		// Test Case 3
		// int[] arr = { 1, -1, 0 };
		// int k = 0;
		// System.out.println(subArraySumEqualsK(arr, k));
		// Expected: 3

		// Test Case 4
		// int[] arr = { 3, 4, 7, 2, -3, 1, 4, 2 };
		// int k = 7;
		// System.out.println(subArraySumEqualsK(arr, k));
		// Expected: 4

		// Test Case 5
		// int[] arr = { 0, 0, 0 };
		// int k = 0;
		// System.out.println(subArraySumEqualsK(arr, k));
		// Expected: 6
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(n) ~ [ Linear ]