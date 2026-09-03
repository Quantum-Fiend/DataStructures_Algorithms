package problem_solving_fundamentals;

public class removeElementInPlace {
	public static void main(String[] args) {

		int[] arr1 = { 3, 2, 2, 3 };
		int val1 = 3;
		// Expected: length = 2
		// Remaining: {2, 2}

		// int[] arr2 = {0, 1, 2, 2, 3, 0, 4, 2};
		// int val2 = 2;
		// Expected: length = 5
		// Remaining: {0, 1, 3, 0, 4}

		// int[] arr3 = {1, 1, 1, 1};
		// int val3 = 1;
		// Expected: length = 0
		// Remaining: {}

		// int[] arr4 = {1, 2, 3, 4, 5};
		// int val4 = 6;
		// Expected: length = 5
		// Remaining: {1, 2, 3, 4, 5}

		// int[] arr5 = {2, 3, 2, 4, 2, 5};
		// int val5 = 2;
		// Expected: length = 3
		// Remaining: {3, 4, 5}

		int pointer = 0; // next valid element ki position

		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] != val1) {
				arr1[pointer] = arr1[i];
				pointer++;
			}
		}

		System.out.println("Length = " + pointer);

		for (int i = 0; i < pointer; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}
// Time Complexity = O[n] ~ [ Linear ]
// Space Complexity = O[1] ~ [ Constant ]