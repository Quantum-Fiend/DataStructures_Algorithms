package problem_solving_fundamentals;

import java.util.*;

public class fourSum_055 {
	public static List<List<Integer>> fourSum(int[] arr, int target) {

		List<List<Integer>> list = new ArrayList<>();

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 3; i++) {
			if (i > 0 && arr[i] == arr[i - 1])
				continue;

			for (int j = i + 1; j < arr.length - 2; j++) {
				if (j > i + 1 && arr[j] == arr[j - 1])
					continue;

				int left = j + 1;
				int right = arr.length - 1;

				while (left < right) {

					long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];

					if (sum == target) {

						list.add(Arrays.asList(
								arr[i],
								arr[j],
								arr[left],
								arr[right]));
						while (left < right && arr[left] == arr[left + 1])
							left++;

						while (left < right && arr[right] == arr[right - 1])
							right--;

						left++;
						right--;

					} else if (sum < target) {
						left++;

					} else {
						right--;
					}
				}
			}
		}

		return list;
	}

	public static void main(String[] args) {

		// Test Case 1
		int[] arr = { 1, 0, -1, 0, -2, 2 };
		int target = 0;
		System.out.println(fourSum(arr, target));
		// Expected: [[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]

		// Test Case 2
		// int[] arr = {2, 2, 2, 2, 2};
		// int target = 8;
		// System.out.println(fourSum(arr, target));
		// Expected: [[2, 2, 2, 2]]

		// Test Case 3
		// int[] arr = {1, 2, 3, 4, 5};
		// int target = 10;
		// System.out.println(fourSum(arr, target));
		// Expected: [[1, 2, 3, 4]]

		// Test Case 4
		// int[] arr = {-3, -1, 0, 2, 4, 5};
		// int target = 0;
		// System.out.println(fourSum(arr, target));
		// Expected: [[-3, -1, 0, 4]]

		// Test Case 5
		// int[] arr = {1, 1, 1, 1, 1};
		// int target = 10;
		// System.out.println(fourSum(arr, target));
		// Expected: []
	}
}
// Time Complexity = O(n^3) ~ [ Cubic ]
// Space Complexity = O(k) ~ [ Quadruplets ]