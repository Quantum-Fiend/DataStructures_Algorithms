package problem_solving_fundamentals;

public class findLargestElement_001 {
	public static void main(String[] args) {

		int[] arr1 = { -5, 12, 3 }; // Test Case 1

		// int[] arr2 = { 0, -7, 15 }; // Test Case 2

		// int[] arr3 = { 100, 1, -50 }; // Test Case 3

		int largest = arr1[0];

		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] > largest) {
				largest = arr1[i];
			}
		}

		System.out.println(largest);

	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(1) ~ [ Constant ]