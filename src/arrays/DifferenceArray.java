package arrays;
/*
!----------------------------------------------------------
* Problem 1: Range Update Queries
* Status: DONE ✅
* Approach: Difference Array Technique
* Time Complexity: O(Q)
* Space Complexity: O(n)
!----------------------------------------------------------
*/
//public class DifferenceArray {

//	public static void applyQueries(int n, int[][] queries) {

//        int[] arr = new int[n];

//        for (int[] q : queries) {
//            int L = q[0];
//            int R = q[1];
//            int val = q[2];

//            arr[L] += val;
//            if (R + 1 < n) {
//                arr[R + 1] -= val;
//            }
//        }

//        for (int i = 1; i < n; i++) {
//            arr[i] += arr[i - 1];
//        }

//        for (int x : arr) {
//            System.out.print(x + " ");
//        }
//    }

//    public static void main(String[] args) {
//        int n = 5;

//        int[][] queries = {
//            {1, 3, 2},
//            {2, 4, 3}
//        };

//        applyQueries(n, queries);
//    }
//}

/*
!----------------------------------------------------------
* Problem 2: Perform Multiple Range Increments
* Status: DONE ✅
* Approach: Prefix Sum Optimization For Range Window
* Time Complexity: O(N + Q)
* Space Complexity: O(n)
!----------------------------------------------------------
*/
public class DifferenceArray {

    public static int[] multipleRangeIncrement(int n, int[][] queries) {
        int[] diff = new int[n];

        for (int[] q : queries) {
            int L = q[0];
            int R = q[1];
            int val = q[2];

            diff[L] += val;
            if (R + 1 < n) {
                diff[R + 1] -= val;
            }
        }

        int[] result = new int[n];
        result[0] = diff[0];

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + diff[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;

        int[][] queries = {
            {1, 3, 2},
            {2, 4, 3}
        };

        int[] result = multipleRangeIncrement(n, queries);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}