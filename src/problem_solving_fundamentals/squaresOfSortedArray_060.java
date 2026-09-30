package problem_solving_fundamentals;

import java.util.Arrays;

public class squaresOfSortedArray_060 {
	public static int[] sortedSquares(int[] nums) {

		int[] result = new int[nums.length];

		int left = 0;
		int right = nums.length - 1;
		int k = nums.length - 1;

		while (left <= right) {
			if (Math.abs(nums[left]) > Math.abs(nums[right])) {
				result[k] = nums[left] * nums[left];
				left++;
			} else {
				result[k] = nums[right] * nums[right];
				right--;
			}
			k--;
		}
		return result;
	}

	public static void main(String[] args) {

		// Test Case 1
		int[] nums = { -4, -1, 0, 3, 10 };
		System.out.println(Arrays.toString(sortedSquares(nums)));
		// Expected: [0, 1, 9, 16, 100]

		// Test Case 2
		// int[] nums = {-7, -3, -1};
		// System.out.println(Arrays.toString(sortedSquares(nums)));
		// Expected: [1, 9, 49]

		// Test Case 3
		// int[] nums = {0, 1, 2, 3, 4};
		// System.out.println(Arrays.toString(sortedSquares(nums)));
		// Expected: [0, 1, 4, 9, 16]

		// Test Case 4
		// int[] nums = {-5, -2, -2, 0, 2, 5};
		// System.out.println(Arrays.toString(sortedSquares(nums)));
		// Expected: [0, 4, 4, 4, 25, 25]

		// Test Case 5
		// int[] nums = {0};
		// System.out.println(Arrays.toString(sortedSquares(nums)));
		// Expected: [0]
	}
}
// Time Complxity = O(n) ~ [ Linear ]
// Space Complxity = O(n) ~ [ Linear ]