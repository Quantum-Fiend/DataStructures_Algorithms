package arrays;
/*
!----------------------------------------------------------
* Problem 1: Range Update Queries
* Status: DONE ✅
* Approach:
* Time Complexity: O(n)
* Space Complexity: O(n)
!----------------------------------------------------------
 */
public class DifferenceArray {

    public static void applyQueries(int n, int[][] queries) {
        int[] arr = new int[n];

        // Step 1: Apply difference updates
        for (int[] q : queries) {
            int L = q[0];
            int R = q[1];
            int val = q[2];

            arr[L] += val;
            if (R + 1 < n) {
                arr[R + 1] -= val;
            }
        }

        // Step 2: Prefix sum to get final array
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }

        // Print result
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int n = 5;

        int[][] queries = {
            {1, 3, 2},
            {2, 4, 3}
        };

        applyQueries(n, queries);
    }
}
