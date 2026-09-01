package problem_solving_fundamentals;

public class findMaxMin {
	public static void main(String[] args) {

		int[] arr1 = { 7, 2, 9, 4, 1, 6 };
		// Expected: Max = 9, Min = 1

		// int[] arr2 = {5, 5, 5, 5};
		// Expected: Max = 5, Min = 5

		// int[] arr3 = {-10, -3, -7, -1, -20};
		// Expected: Max = -1, Min = -20

		// int[] arr4 = {42};
		// Expected: Max = 42, Min = 42

		// int[] arr5 = {9, 3, 15, 2, 8, 20, 1};
		// Expected: Max = 20, Min = 1

		int maxElement = arr1[0];
		int minElement = arr1[0];

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > maxElement) {
				maxElement = arr1[i];
			} else if (arr1[i] < minElement) {
				minElement = arr1[i];
			}
		}

		System.out.println(maxElement);
		System.out.println(minElement);
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(1) ~ [ Constant ]