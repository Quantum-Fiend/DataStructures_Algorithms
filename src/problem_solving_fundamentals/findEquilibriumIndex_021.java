package problem_solving_fundamentals;

public class findEquilibriumIndex_021 {
	public static int findEquilibriumIndex(int[] arr) {

		int totalSum = 0;

		for (int num : arr)
			totalSum += num;

		int leftSum = 0;

		for (int i = 0; i < arr.length; i++) {
			int rightSum = totalSum - leftSum - arr[i];

			if (leftSum == rightSum)
				return i;
			leftSum += arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {

		// Test Case 1
		int[] arr = { 1, 3, 5, 2, 2 };
		System.out.println(findEquilibriumIndex(arr));
		// Expected: 2

		// Test Case 2
		// int[] arr = {1, 2, 3, 4, 6};
		// System.out.println(findEquilibriumIndex(arr));
		// Expected: 3

		// Test Case 3
		// int[] arr = {2, 4, 2};
		// System.out.println(findEquilibriumIndex(arr));
		// Expected: 1

		// Test Case 4
		// int[] arr = {1, 2, 3};
		// System.out.println(findEquilibriumIndex(arr));
		// Expected: -1

		// Test Case 5
		// int[] arr = {0, 0, 0, 0};
		// System.out.println(findEquilibriumIndex(arr));
		// Expected: 0
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(1) ~ [ Constant ]