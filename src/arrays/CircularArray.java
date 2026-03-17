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
//import java.util.Stack;

//public class CircularArray {
//	public static void main(String[] args) {
//		int[] arr = { 4, 5, 2, 10, 8 };
//		int n = arr.length;
//		int[] result = new int[n];
//		Stack<Integer> stack = new Stack<>();

//		for (int i = n - 1; i >= 0; i--) {
//			while (!stack.isEmpty() && stack.peek() <= arr[i]) {
//				stack.pop();
//			}
//			if (stack.isEmpty()) {
//				result[i] = i;
//			} else {
//				result[i] = stack.peek();
//			}

//			stack.push(arr[i]);
//		}

//		for (int x : result) {
//			System.out.println(x + " ");
//		}
//	}
//}

/*
!----------------------------------------------------------
* Problem 3: Gas Station Circular Problem
* Status: DONE ✅
* Approach: Greedy Method
* Time Complexity: O(n)
* Space Complexity: O(1)
!----------------------------------------------------------
*/
//public class CircularArray {
//	public static int canCompleteCircuit(int[] gas, int[] cost) {
//		int totalTank = 0;
//		int currTank = 0;
//		int startIndex = 0;

//		for (int i = 0; i < gas.length; i++) {
//			int diff = gas[i] - cost[i];
//			totalTank += diff;
//			currTank += diff;

//			if (currTank < 0) {
//				startIndex = i + 1;
//				currTank = 0;
//			}
//		}

//		if (totalTank >= 0) {
//			return startIndex;
//		} else {
//			return -1;
//		}
//	}

//	public static void main(String[] args) {
//		int[] gas = { 1, 2, 3, 4, 5 };
//		int[] cost = { 3, 4, 5, 1, 2 };

//		int result = canCompleteCircuit(gas, cost);
//		System.out.println(result);
//	}
//}

/*
!----------------------------------------------------------
* Problem 4: Circular Rotation Check
* Status: DONE ✅
* Approach: String Concatenation + Substring Check
* Time Complexity: O(n)
* Space Complexity: O(1)
!----------------------------------------------------------
*/
//public class CircularArray {

//    public static boolean isCircularRotation(String s1, String s2) {

//        if (s1 == null || s2 == null) {
//            return false;
//        }

//        s1 = s1.trim();
//        s2 = s2.trim();

//        if (s1.length() != s2.length()) {
//            return false;
//        }

//        String temp = s1 + s1;
//        return temp.contains(s2);
//    }

//    public static void main(String[] args) {
//        String s1 = "ABCD";
//        String s2 = "CDAB";

//        System.out.println(isCircularRotation(s1, s2));
//    }
//}

/*
!----------------------------------------------------------
* Problem 5: Circular Traversal Simulation
* Status: DONE ✅
* Approach: Modulo Arithmetic Simulation
* Time Complexity: O(n)
* Space Complexity: O(1)
!----------------------------------------------------------
*/
public class CircularArray {
	public static void circularPrint(int[] arr, int start, int steps) {
		int n = arr.length;

		for (int i = 0; i < steps; i++) {
			int index = (start + i) % n;
			System.out.println(arr[index] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		circularPrint(arr, 3, 8);
	}
}
