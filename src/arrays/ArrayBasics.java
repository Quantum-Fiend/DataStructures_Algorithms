package arrays;

/*
!---------------------------------------
* Problem 1: Find Largest Element in Array
* Status: DONE ✅
* Approach: Linear Scan
* Time Complexity: O(n)
* Space Complexity: O(1)
!---------------------------------------
 */
//public class ArrayBasics {

//    public static void main(String[] args) {
//        int[] array = {2, 3, 1, 9, 6, 8, 15, 4};
//        int findLargest = array[0];

//        for (int i : array) {
//            if (i > findLargest) {
//                findLargest = i;
//            }
//        }
//        System.out.println(findLargest);
//    }
//}

/*
!---------------------------------------
* Problem 2: Find the second Largest Element
* Status: DONE ✅
* Approach: Single Pass Traversal Approach
* Time Complexity: O(n)
* Space Complexity: O(1)
!---------------------------------------
 */
//public class ArrayBasics {
//	public static void main(String[] args) {
//		int[] array = { 5, 3, 1, 17, 98, 711, 5 };

//		int largest = Integer.MIN_VALUE;
//		int secondLargest = Integer.MIN_VALUE;

//		for (int i = 0; i < array.length; i++) {
//			if (array[i] > largest) {
//				secondLargest = largest;
//				largest = array[i];
//			} else if (array[i] > secondLargest && array[i] != largest) {
//				secondLargest = array[i];
//			}
//		}
//		System.out.println(secondLargest);

//	}
//}

/*
!---------------------------------------
* Problem 3: Check If the array is Sorted
* Status: DONE ✅
* Approach: Linear Traversal
* Time Complexity: O(n)
* Space Complexity: O(1)
!---------------------------------------
 */
//public class ArrayBasics {
//	public static void main(String[] args) {
//		int[] array = { 1, 3, 4, 1, 2, 9, 8, 7 };
//		boolean isSorted = true;

//		for (int i = 0; i < array.length; i++) {
//				if (array[i] < array[i + 1]) {
//					isSorted = false;
//					break;
//				}
//		}
//		System.out.println(isSorted);
//	}
//}

/*
!---------------------------------------
* Problem 4: Reverse an array
* Status: DONE ✅
* Approach: Reverse Traversal
* Time Complexity: O(n)
* Space Complexity: O(n)  // because of StringBuilder
!---------------------------------------
 */
//public class ArrayBasics {
//	public static void main(String[] args) {
//		int[] array = { 1, 2, 3, 4, 5 };

//		StringBuilder rev = new StringBuilder();
//		for (int i = array.length - 1; i >= 0; i--) {
//			rev.append(array[i]);

//			if (i != 0) {
//				rev.append(",");
//			}
//		}
//		System.out.println(rev);
//	}
//}


/*
!---------------------------------------
* Problem 5: Rotate Array by K Steps
* Status: DONE ✅
* Approach: Reversal Algorithm
* Time Complexity: O(n)
* Space Complexity: O(n)
!---------------------------------------
 */
public class ArrayBasics {

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
