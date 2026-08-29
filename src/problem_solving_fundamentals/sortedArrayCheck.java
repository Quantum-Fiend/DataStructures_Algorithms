package problem_solving_fundamentals;

public class sortedArrayCheck {
	public static void main(String[] args) {

		// int[] arr1 = { 1, 2, 3, 4, 5, 6 }; // Test Case 1

		// int[] arr2 = { 1, 2, 4, 3, 5, 6 }; // Test Case 2

		int[] arr3 = { 2, 4, 6, 8, 10 }; // Test Case 3

		boolean isSorted = true;

		for (int i = 0; i < arr3.length - 1; i++) {
			if (arr3[i] > arr3[i + 1])
				isSorted = false;
		}
		System.out.println("Sorted in Accending Order : " + isSorted);
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(1) ~ [ Constant ]