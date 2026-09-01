package problem_solving_fundamentals;

public class rotateArrayKPositions {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int k1 = 2;
		// Expected: {4, 5, 1, 2, 3}

		// int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
		// int k2 = 3;
		// Expected: {5, 6, 7, 1, 2, 3, 4}

		// int[] arr3 = {1, 2, 3};
		// int k3 = 1;
		// Expected: {3, 1, 2}

		// int[] arr4 = {1, 2, 3, 4};
		// int k4 = 4;
		// Expected: {1, 2, 3, 4}

		// int[] arr5 = {1, 2, 3, 4};
		// int k5 = 6;
		// Expected: {3, 4, 1, 2}

		k1 = k1 % arr1.length;

		for (int j = 0; j < k1; j++) {
			int last = arr1[arr1.length - 1];

			for (int i = arr1.length - 1; i > 0; i--) {
				arr1[i] = arr1[i - 1];
			}
			arr1[0] = last;
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + " ");
		}
	}
}
// Time Complexity = O(n x k) ~ [ Quadric ]
// Space Complexity = O(1) ~ [ Constant ]
