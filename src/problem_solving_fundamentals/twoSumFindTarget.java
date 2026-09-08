package problem_solving_fundamentals;

import java.util.HashMap;

public class twoSumFindTarget {
	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap<>();

		int[] arr1 = { 2, 7, 11, 15 };
		int target1 = 9;
		// Expected: {0, 1}

		// int[] arr2 = {3, 2, 4};
		// int target2 = 6;
		// Expected: {1, 2}

		// int[] arr3 = {3, 3};
		// int target3 = 6;
		// Expected: {0, 1}

		// int[] arr4 = {-1, -3, 5, 7};
		// int target4 = 4;
		// Expected: {0, 2}

		// int[] arr5 = {1, 5, 8, 12, 20};
		// int target5 = 25;
		// Expected: {1, 4}

		for (int i = 0; i < arr1.length; i++) {
			int currentNumber = arr1[i];
			int remainder = target1 - currentNumber;

			if (map.containsKey(remainder)) {
				System.out.println("{ " + map.get(remainder) + " , " + i + " }");
				break;
			}
			map.put(currentNumber, i);
		}
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(n) ~ [ Linear ]