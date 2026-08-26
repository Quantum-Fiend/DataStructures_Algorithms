package problem_solving_fundamentals;

public class findSmallest {
	public static void main(String[] args) {

		// int[] arr1 = { -5, 12, 3, -20, 8 }; // Test Case 1

		// int[] arr2 = { 25, 7, 15, 42, 3 }; //Test Case 2

		int[] arr3 = { -10, -3, -25, -7, -15 }; // Test Case 3

		int smallest = arr3[0];

		for (int i = 1; i < arr3.length; i++) {
			if (arr3[i] < smallest) {
				smallest = arr3[i];
			}
		}
		System.out.println(smallest);
	}
}
