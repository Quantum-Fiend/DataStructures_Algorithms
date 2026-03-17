package arrays;
/*
!----------------------------------------------------------
* Problem 1: Range Update Queries
* Status: DONE ✅
* Approach: Difference Array Technique
* Time Complexity: O(N + Q)
* Space Complexity: O(N)
!----------------------------------------------------------
 */
public class DifferenceArray {
	public static void main(int n, int[][] queries) {
		int[] arr = new int[n];

		for (int[] q : queries) {
			int L = q[0];
			int R = q[1];
			int val = q[2];

			arr[L] += val;
			if (R + 1 < n) {
				arr[R + 1] -= val;
			}
		}

		for (int i = 1; i < n; i++) {
			arr[i] += arr[i - 1];
		}

		for (int x : arr) {
			System.out.println(x + " ");
		}
	}

	public static void main(String[] args) {
		int n = 5;

		int[][] queries = {
			{1,3,2},
	    	{2,4,3}
		};

		main(n, queries);
	}
}