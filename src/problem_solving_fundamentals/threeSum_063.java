package problem_solving_fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum_063 {
	public static List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> list = new ArrayList<>();

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];

				if (sum == 0) {
					list.add(Arrays.asList(nums[i], nums[left], nums[right]));
					left++;
					right--;

					while (left < right && nums[left] == nums[left - 1])
						left++;

					while (left < right && nums[right] == nums[right + 1])
						right--;
				} else if (sum < 0)
					left++;

				else {
					right--;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {

		// Test Case 1
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		System.out.println(threeSum(nums));
		// Expected: [[-1, -1, 2], [-1, 0, 1]]

		// Test Case 2
		// int[] nums = { 0, 0, 0 };
		// System.out.println(threeSum(nums));
		// Expected: [[0, 0, 0]]

		// Test Case 3
		// int[] nums = { 0, 1, 1 };
		// System.out.println(threeSum(nums));
		// Expected: []

		// Test Case 4
		// int[] nums = { -2, 0, 1, 1, 2 };
		// System.out.println(threeSum(nums));
		// Expected: [[-2, 0, 2], [-2, 1, 1]]

		// Test Case 5
		// int[] nums = { -1, 0, 1, 0, 2, -1, -4 };
		// Expected: [[-1, -1, 2], [-1, 0, 1]]
	}
}
// Time Complexity = O(n^2) ~ [ Quadric ]
// Space Complexity = O(1) ~ [ Constant ]