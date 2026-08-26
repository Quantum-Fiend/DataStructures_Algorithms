package problem_solving_fundamentals;

public class findSum {
	public static void main(String[] args) {

		// int[] arr1 = { 5, 10, 15, 20 }; // Test Case 1

		// int[] arr2 = { -5, 10, -15, 20 }; // Test Case 2

		int[] arr3 = { -10, -20, -30, -40 }; // Test Case 3

		int sum = 0;

		for (int i = 1; i < arr3.length; i++) {
			sum += arr3[i];
		}
		System.out.println(sum);
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(1) ~ [ Constant ]