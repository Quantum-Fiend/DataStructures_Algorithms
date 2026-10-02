package problem_solving_fundamentals;

public class containerWithMostWater_062 {
	public static int maxArea(int[] height) {

		int left = 0, right = height.length - 1;
		int maxArea = 0;

		while (left < right) {
			int currentArea = (right - left) * Math.min(height[left], height[right]);

			maxArea = Math.max(currentArea, maxArea);

			if (height[left] < height[right])
				left++;
			else
				right--;
		}

		return maxArea;
	}

	public static void main(String[] args) {

		// Test Case 1
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(height));
		// Expected: 49

		// Test Case 2
		// int[] height = {1, 1};
		// System.out.println(maxArea(height));
		// Expected: 1

		// Test Case 3
		// int[] height = {1, 2, 1};
		// System.out.println(maxArea(height));
		// Expected: 2

		// Test Case 4
		// int[] height = {4, 3, 2, 1, 4};
		// System.out.println(maxArea(height));
		// Expected: 16

		// Test Case 5
		// int[] height = {1, 2};
		// System.out.println(maxArea(height));
		// Expected: 1
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(1) ~ [ Constant ]
