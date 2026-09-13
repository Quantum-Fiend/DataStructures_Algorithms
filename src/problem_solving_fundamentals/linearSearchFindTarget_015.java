package problem_solving_fundamentals;

public interface linearSearchFindTarget_015 {
	public static void main(String[] args) {

		// Test Case 1
		int[] arr = { 10, 20, 30, 40, 50 };
		int target = 30;
		// Expected: 2

		// Test Case 2
		// int[] arr = { 5, 8, 12, 15, 20 };
		// int target = 15;
		// Expected: 3

		// Test Case 3
		// int[] arr = { 7, 14, 21, 28, 35 };
		// int target = 100;
		// Expected: -1

		// Test Case 4
		// int[] arr = { 3, 6, 9, 12, 15 };
		// int target = 3;
		// Expected: 0

		// Test Case 5
		// int[] arr = { 4, 9, 2, 9, 7, 9 };
		// int target = 9;
		// Expected: 1

		boolean found = false;

		for (int i = 0; i < arr.length; i++)
			if (arr[i] == target) {
				found = true;
				System.out.println("Target Found At Index : " + i);
				break;
			}

		if (!found)
			System.out.println(-1);

	}
}
// Time Complexity = O(n) = [ Linear ]
// Space Complexity = O(1) = [ Constant ]