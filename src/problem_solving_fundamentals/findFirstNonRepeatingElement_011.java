package problem_solving_fundamentals;

public class findFirstNonRepeatingElement_011 {
	public static void main(String[] args) {

		int[] arr1 = { 4, 5, 1, 2, 1, 4, 5 };
		// Test Case 1 -> Expected: 2

		// int[] arr2 = { 1, 1, 2, 2, 3, 3 };
		// Test Case 2 -> Expected: -1

		// int[] arr3 = { 7, 7, 8, 8, 9, 9, 10 };
		// Test Case 3 -> Expected: 10

		// int[] arr4 = { 5, 3, 4, 3, 5, 6, 4 };
		// Test Case 4 -> Expected: 6

		// int[] arr5 = { 2 };
		// Test Case 5 -> Expected: 2

		int nonRepeating = 0;

		for (int i = 0; i < arr1.length; i++) {
			int count = 0;

			for (int j = 0; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					count++;
				}
			}
			if (count == 1) {
				nonRepeating = arr1[i];
				break;
			}
		}
		System.out.println("Non Repeating : " + nonRepeating);
	}
}
// Time Complexity = O(n^2) ~ [ Quadric ]
// Space Complexity = O(1) ~ [ Constant ]