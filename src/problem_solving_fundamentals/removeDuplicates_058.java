package problem_solving_fundamentals;

public class removeDuplicates_058 {
	public static int removeDuplicates(int[] arr) {

		int left = 0;
		int right = 1;

		while (right < arr.length) {
			if (arr[left] != arr[right]) {
				left++;
				arr[left] = arr[right];
			}
			right++;
		}
		return left + 1;
	}

	public static void main(String[] args) {

		// Test Case 1
		int[] arr1 = { 1, 1, 2 };
		System.out.println(removeDuplicates(arr1));
		// Expected: 2
		// Array after removal: [1, 2, _]

		// Test Case 2
		int[] arr2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(arr2));
		// Expected: 5
		// Array after removal: [0, 1, 2, 3, 4, _, _, _, _, _]

		// Test Case 3
		int[] arr3 = { 1, 2, 3, 4, 5 };
		System.out.println(removeDuplicates(arr3));
		// Expected: 5
		// Array after removal: [1, 2, 3, 4, 5]

		// Test Case 4
		int[] arr4 = { 1, 1, 1, 1 };
		System.out.println(removeDuplicates(arr4));
		// Expected: 1
		// Array after removal: [1, _, _, _]

		// Test Case 5
		int[] arr5 = { 2, 2, 3, 3, 4, 4, 5 };
		System.out.println(removeDuplicates(arr5));
		// Expected: 4
		// Array after removal: [2, 3, 4, 5, _, _, _]
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(1) ~ [ Constant ]