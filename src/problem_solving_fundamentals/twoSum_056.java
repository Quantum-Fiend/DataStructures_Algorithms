package problem_solving_fundamentals;

public class twoSum_056 {

	public static int[] twoSum(int[] arr, int target) {

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int sum = arr[left] + arr[right];

			if (sum == target)
				return new int[] { left, right };
			else if (sum < target)
				left++;
			else
				right--;
		}
		return new int[] {};
	}

	public static void main(String[] args) {

		// Test Case 1
		int[] arr1 = { 2, 7, 11, 15 };
		int target1 = 9;
		System.out.println(java.util.Arrays.toString(twoSum(arr1, target1)));
		// Expected: [0, 1]

		// Test Case 2
		// int[] arr2 = { 1, 3, 4, 6, 8, 10 };
		// int target2 = 14;
		// System.out.println(java.util.Arrays.toString(twoSum(arr2, target2)));
		// Expected: [2, 5]

		// Test Case 3
		// int[] arr3 = { -5, -2, 0, 3, 7 };
		// int target3 = 2;
		// System.out.println(java.util.Arrays.toString(twoSum(arr3, target3)));
		// Expected: [1, 3]

		// Test Case 4
		// int[] arr4 = { 1, 2, 3, 4, 5, 6 };
		// int target4 = 11;
		// System.out.println(java.util.Arrays.toString(twoSum(arr4, target4)));
		// Expected: [4, 5]

		// Test Case 5
		// int[] arr5 = { -10, -4, -1, 0, 3, 8, 12 };
		// int target5 = 8;
		// System.out.println(java.util.Arrays.toString(twoSum(arr5, target5)));
		// Expected: [1, 6]
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(1) ~ [ Constant ]