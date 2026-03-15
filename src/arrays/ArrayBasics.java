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
* Approach: Single Pass Traversal 
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
//public class ArrayBasics {

//    public static void rotateArray(int[] arr, int k) {
//        int n = arr.length;
//        k = k % n;
//        reverse(arr, 0, n - 1);
//        reverse(arr, 0, k - 1);
//        reverse(arr, k, n - 1);
//    }

//    public static void reverse(int[] arr, int start, int end) {
//        while (start < end) {
//            int temp = arr[start];
//            arr[start++] = arr[end];
//            arr[end--] = temp;
//        }
//    }

//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int k = 3;
//        rotateArray(arr, k);
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//    }
//}

/*
!---------------------------------------
* Problem 6: Move all zeros to the end
* Status: DONE ✅
* Approach: Two Pointer Technique
* Time Complexity: O(n)
* Space Complexity: O(1)
!---------------------------------------
 */
//public class ArrayBasics {
//	public static void main(String[] args) {
//		int[] arr = { 0, 1, 0, 1, 12 };
//		int index = 0;

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != 0) {
//				arr[index] = arr[i];
//				index++;
//			}
//		}
//		while (index < arr.length) {
//			arr[index] = 0;
//			index++;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	}
//}

/*
!---------------------------------------
* Problem 7: Remove Duplicates From Sorted Array
* Status: DONE ✅
* Approach:	Linked HashSet
* Time Complexity: O(n)
* Space Complexity: O(n)
!---------------------------------------
 */
//import java.util.*;

//public class ArrayBasics {
//	public static void main(String[] args) {
//		int[] arr = { 1, 2, 2, 3, 4, 5, 5, 6 };

//		Set<Integer> set = new LinkedHashSet<>();

//		for (int i = 0; i < arr.length; i++) {
//			set.add(arr[i]);
//		}
//		System.out.println(set);
//	}
//}

/*
!---------------------------------------
* Problem 8: Find Missing Number
* Status: DONE ✅
* Approach: Sum Formula
* Time Complexity: O(n)
* Space Complexity: O(1)
!---------------------------------------
 */
//public class ArrayBasics {
//	public static void main(String[] args) {
//		int[] arr = { 1, 2, 4, 5, 6 };
//		int n = 6;

//		int expectedSum = n * (n + 1) / 2;
//		int actualSum = 0;

//		for (int num : arr) {
//			actualSum += num;
//		}
//		System.out.println("Missing number : " + (expectedSum - actualSum));
//	}
//}

/*
!---------------------------------------
* Problem 9: Union Of Two Array
* Status: DONE ✅
* Approach: Hashing (Using HashSet)
* Time Complexity: O(n + m)
* Space Complexity: O(n + m)
!---------------------------------------
*/
//import java.util.*;
//public class ArrayBasics {
//	public static void main(String[] args) {
//		int[] arr1 = { 1, 2, 3, 4};
//		int[] arr2 = { 3, 4, 5, 6 };

//		Set<Integer> set = new HashSet<>();

//		for (int i = 0; i < arr1.length; i++) {
//			set.add(arr1[i]);
//		}

//		for (int i = 0; i < arr2.length; i++) {
//			set.add(arr2[i]);
//		}

//		System.out.println(set);
//	}
//}

/*
!---------------------------------------
* Problem 10: Intersection Of Two Array
* Status: DONE ✅
* Approach: HashSet Based
* Time Complexity: O(m + n)
* Space Complexity: O(n)
!---------------------------------------
*/
import java.util.*;

public class ArrayBasics {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int n : nums1) {
            set.add(n);
        }

        for (int n : nums2) {
            if (set.contains(n)) {
                result.add(n);
                set.remove(n);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 3, 5};

        int[] res = intersection(a, b);
        System.out.println(Arrays.toString(res));
    }
}