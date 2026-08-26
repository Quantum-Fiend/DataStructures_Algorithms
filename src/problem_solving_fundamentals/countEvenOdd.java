package problem_solving_fundamentals;

public class countEvenOdd {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6 }; // Test Case 1

		// int[] arr2 = { -2, -5, 0, 7, 10, 13 }; // Test Case 2

		// int[] arr3 = { 2, 4, 6, 8, 10 }; // Test Case 3

		int oddNumber = 0;
		int evenNumber = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 == 0) {
				evenNumber++;
				System.out.println("Even : " + arr1[i]);
			} else {
				oddNumber++;
				System.out.println("Odd : " + arr1[i]);
			}
		}
		System.out.println("Odd Count : " + oddNumber);
		System.out.println("Even Count : " + evenNumber);
	}
}
