package problem_solving_fundamentals;

import java.util.Arrays;

public class threeSumClosest_064 {
	public static int closestThreeSum(int[] nums, int target) {

		Arrays.sort(nums);

		int closestSum = nums[0] + nums[1] + nums[2];

		for (int i = 0; i < nums.length - 2; i++) {
			int fixedValue = nums[i];

			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int currentSum = fixedValue + nums[left] + nums[right];

				if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
					closestSum = currentSum;
				}
				if (currentSum == target)
					return currentSum;
				if (currentSum < target)
					left++;
				if (currentSum > target)
					right--;
			}
		}
		return closestSum;
	}

	public static void main(String[] args) {

		// Test Case 1
		int[] nums = { -1, 2, 1, -4 };
		int target = 1;
		System.out.println(closestThreeSum(nums, target));
		// Expected: 2

		// Test Case 2
		// int[] nums = { 0, 0, 0 };
		// int target = 1;
		// System.out.println(closestThreeSum(nums, target));
		// Expected: 0

		// Test Case 3
		// int[] nums = { 1, 1, 1, 0 };
		// int target = -100;
		// System.out.println(closestThreeSum(nums, target));
		// Expected: 2

		// Test Case 4
		// int[] nums = { 1, 2, 4, 8, 16, 32, 64, 128 };
		// int target = 82;
		// System.out.println(closestThreeSum(nums, target));
		// Expected: 82

		// Test Case 5
		// int[] nums = { -10, -5, -2, 0, 3, 7 };
		// int target = -1;
		// System.out.println(closestThreeSum(nums, target));
		// Expected: -2

	}
}
// Time Complexity = O(n ^ 2) ~ [ Quadric ]
// Space Complexity = O(1) ~ [ Constant ]