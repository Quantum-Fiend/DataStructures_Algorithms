package problem_solving_fundamentals;

public class findSecondSmallest_007 {
	public static void main(String[] args) {

		// Test Case 1
		int[] arr = { 10, 5, 8, 3, 12, 7 };
		// Expected: 5

		// Test Case 2
		// int[] arr = { 20, 15, 8, 25, 10 };
		// Expected: 10

		// Test Case 3
		// int[] arr = { 5, 5, 8, 2, 2, 10 };
		// Expected: 5

		// Test Case 4
		// int[] arr = { 1, 2, 3, 4, 5 };
		// Expected: 2

		// Test Case 5
		// int[] arr = { 10, 10, 10, 5, 20 };
		// Expected: 10

		int smallest = arr[0];
		int secondSmallest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] > smallest && arr[i] < secondSmallest)
				secondSmallest = arr[i];
		}
		System.out.println("Second Smallest Element is : " + secondSmallest);
	}
}
// Time Complexity = O(n) ~ [ linear ]
// Space Complexity = O(1) ~ [ Constant ]
