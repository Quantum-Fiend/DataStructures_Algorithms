package problem_solving_fundamentals;

public class maximumSumSubarraySizeK_066 {
	public static int maximumSumSubarrayK(int[] arr, int k) {

		int sum = 0;

		for (int i = 0; i < k; i++)
			sum += i;

		int maxSum = sum;

		for (int i = k; i < arr.length; i++) {
			sum = sum - arr[i - k];
			sum = sum + arr[i];

			if (sum > maxSum) {
				maxSum = sum;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {

		// Test Case 1
		int[] arr1 = { 2, 1, 5, 1, 3, 2 };
		System.out.println(maximumSumSubarrayK(arr1, 3));
		// Expected: 9

		// Test Case 2
		int[] arr2 = { 2, 3, 4, 1, 5 };
		System.out.println(maximumSumSubarrayK(arr2, 2));
		// Expected: 7

		// Test Case 3
		int[] arr3 = { 5, 5, 5, 5 };
		System.out.println(maximumSumSubarrayK(arr3, 2));
		// Expected: 10

		// Test Case 4
		int[] arr4 = { -2, -1, -5, -3 };
		System.out.println(maximumSumSubarrayK(arr4, 2));
		// Expected: -3

		// Test Case 5
		int[] arr5 = { 7 };
		System.out.println(maximumSumSubarrayK(arr5, 1));
		// Expected: 7
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(1) ~ [ Constant ]