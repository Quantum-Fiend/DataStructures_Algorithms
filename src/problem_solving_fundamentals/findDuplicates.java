package problem_solving_fundamentals;

public class findDuplicates {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 2, 4, 5, 1 };
		// Test Case 1 → Duplicates: 1, 2

		// int[] arr2 = {1, 2, 3, 4, 5};
		// Test Case 2 → Duplicates: None

		// int[] arr3 = {1, 1, 1, 2, 2, 3};
		// Test Case 3 → Duplicates: 1, 2

		// int[] arr4 = {5, 4, 3, 2, 1, 5, 4, 3};
		// Test Case 4 → Duplicates: 3, 4, 5

		// int[] arr5 = {2, 3, 4, 2, 3, 4, 5, 6, 6};
		// Test Case 5 → Duplicates: 2, 3, 4, 6

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					System.out.println(arr1[i]);
					break;
				}
			}
		}
	}
}
// Time Complexity = O(n^2) ~ [ Quadric ]
// Space Complexity = O(1) ~ [ Constant ]