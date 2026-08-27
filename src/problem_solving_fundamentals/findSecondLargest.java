package problem_solving_fundamentals;

public class findSecondLargest {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6 }; // Test Case 1

		// int[] arr2 = { -2, -5, 0, 7, 10, 13 }; // Test Case 2

		// int[] arr3 = { 2, 4, 6, 8, 10 }; // Test Case 3

		int largestElement = arr1[0];
		int secondLargest = arr1[0];

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > largestElement) {
				secondLargest = largestElement;
				largestElement = arr1[i];
			} else if (arr1[i] > secondLargest && arr1[i] != largestElement) {
				secondLargest = arr1[i];
			}
		}

		System.out.println("Largest Element : " + largestElement);
		System.out.println("Second Largest Element : " + secondLargest);
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(1) ~ [ Constant ]