package problem_solving_fundamentals;

import java.util.Arrays;

public class moveAllZerosToEnd_057 {
	public static void moveAllZeros(int[] arr) {

		int left = 0;

		for (int right = 0; right < arr.length; right++) {
			if (arr[right] != 0) {
				arr[left] = arr[right];
				left++;
			}
		}
		while (left < arr.length) {
			arr[left] = 0;
			left++;
		}
	}

	public static void main(String[] args) {

		// Test Case 1
		int[] arr1 = { 0, 1, 0, 3, 12 };
		moveAllZeros(arr1);
		System.out.println(Arrays.toString(arr1));
		// Expected: [1, 3, 12, 0, 0]

		// Test Case 2
		// int[] arr2 = { 0, 0, 1, 0, 2, 0, 3 };
		// moveAllZeros(arr2);
		// System.out.println(Arrays.toString(arr2));

		// Expected: [1, 2, 3, 0, 0, 0, 0]

		// Test Case 3
		// int[] arr3 = { 1, 2, 3, 4, 5 };
		// moveAllZeros(arr3);
		// System.out.println(Arrays.toString(arr3));

		// Expected: [1, 2, 3, 4, 5]

		// Test Case 4
		// int[] arr4 = { 0, 0, 0, 1, 2 };
		// moveAllZeros(arr4);
		// System.out.println(Arrays.toString(arr4));

		// Expected: [1, 2, 0, 0, 0]

		// Test Case 5
		// int[] arr5 = { 1, 0, 2, 0, 3, 0, 4 };
		// moveAllZeros(arr5);
		// System.out.println(Arrays.toString(arr5));

		// Expected: [1, 2, 3, 4, 0, 0, 0]
	}
}
