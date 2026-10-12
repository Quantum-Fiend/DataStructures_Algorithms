package problem_solving_fundamentals;

public class SmallestSubArraySum_067 {
	public static int smallestSubArray(int[] arr, int target) {
		return -1;
	}

	public static void main(String[] args) {

		// Test Case 1
		int[] arr = { 2, 3, 1, 2, 4, 3 };
		int target = 7;
		System.out.println(smallestSubArray(arr, target));
		// Expected: 2

		// Test Case 2
		// int[] arr = { 1, 4, 4 };
		// int target = 4;
		// System.out.println(smallestSubArray(arr, target));
		// Expected: 1

		// Test Case 3
		// int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1 };
		// int target = 11;
		// System.out.println(smallestSubArray(arr, target));
		// Expected: 0

		// Test Case 4
		// int[] arr = { 1, 2, 3, 4, 5 };
		// int target = 11;
		// System.out.println(smallestSubArray(arr, target));
		// Expected: 3

		// Test Case 5
		// int[] arr = { 2, 3, 1, 2, 4, 3 };
		// int target = 15;
		// System.out.println(smallestSubArray(arr, target));
		// Expected: 0
	}
}
