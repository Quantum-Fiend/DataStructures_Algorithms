package arrays;

/*
!----------------------------------------------------------
* Problem 1: Maximum Sum Curcular SubArray
* Status: DONE ✅
* Approach: Kadane’s Algorithm with Circular Subarray Trick
* Time Complexity: O(n)
* Space Complexity: O(n)
!----------------------------------------------------------
 */
//public class CircularArray {

//    public static int kadane(int[] arr) {
//        int maxEndingHere = arr[0];
//        int maxSoFar = arr[0];

//        for (int i = 1; i < arr.length; i++) {
//            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
//            maxSoFar = Math.max(maxSoFar, maxEndingHere);
//        }
//        return maxSoFar;
//    }

//    public static int maxCircularSum(int[] arr) {
//        int normalMax = kadane(arr);

//        int totalSum = 0;
//        for (int num : arr) {
//            totalSum += num;
//        }
//        int[] invertedArr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            invertedArr[i] = -arr[i];
//        }

//        int maxInverted = kadane(invertedArr);
//        int minSum = -maxInverted;

//        int circularMax = totalSum - minSum;

//        if (circularMax == 0) {
//            return normalMax;
//        }

//        return Math.max(normalMax, circularMax);
//    }

//    public static void main(String[] args) {
//        int[] arr = {5, -3, 5};
//        System.out.println("Maximum Circular Subarray Sum: " + maxCircularSum(arr));
//    }
//}

/*
!----------------------------------------------------------
* Problem 2: Next Greater Element in Circular Array
* Status: DONE ✅
* Approach: Monotonic Stack (Next Greater Element using stack)
* Time Complexity: O(n)
* Space Complexity: O(n)
!----------------------------------------------------------
*/
import java.util.Stack;

public class CircularArray {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 10, 8 };
		int n = arr.length;
		int[] result = new int[n];
		Stack<Integer> stack = new Stack<>();

		for (int i = n - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				result[i] = i;
			} else {
				result[i] = stack.peek();
			}

			stack.push(arr[i]);
		}

		for (int x : result) {
			System.out.println(x + " ");
		}
	}
}