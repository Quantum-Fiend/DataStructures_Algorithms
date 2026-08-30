package problem_solving_fundamentals;

public class findMissingNumber {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 5, 6 }; // Test Case 1 → Missing: 4

		// int[] arr2 = {1, 2, 4, 5, 6}; // Test Case 2 → Missing: 3

		// int[] arr3 = {2, 3, 4, 5, 6}; // Test Case 3 → Missing: 1

		// int[] arr4 = {1, 2, 3, 4, 5}; // Test Case 4 → Missing: 6

		// int[] arr5 = {2, 3, 1, 5, 4, 7, 6, 9, 8}; // Test Case 5 → Missing: 10

		int actualSum = 0;
		int n = arr1.length + 1;
		int expectedSum = n * (n + 1) / 2;

		for (int i = 0; i < arr1.length; i++)
			actualSum += arr1[i];

		int missingNumber = expectedSum - actualSum;

		System.out.println("Actual Sum : " + actualSum);
		System.out.println("Expected Sum : " + expectedSum);
		System.out.println("Missing Number : " + missingNumber);
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(1) ~ [ Constant ]