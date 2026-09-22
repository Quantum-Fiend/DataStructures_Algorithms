package problem_solving_fundamentals;

import java.util.HashSet;

public class happyNumber_054 {
	public static boolean happyNumber(int n) {

		HashSet<Integer> set = new HashSet<>();

		while (n != 1) {
			if (!set.add(n))
				return false;

			int sum = 0;

			while (n > 0) {
				int digit = n % 10;
				sum += digit * digit;
				n = n / 10;
			}
			n = sum;
		}
		return true;
	}

	public static void main(String[] args) {

		// Test Case 1
		int n = 19;
		System.out.println(happyNumber(n));
		// Expected: true

		// Test Case 2
		// int n = 2;
		// System.out.println(happyNumber(n));
		// Expected: false

		// Test Case 3
		// int n = 1;
		// System.out.println(happyNumber(n));
		// Expected: true

		// Test Case 4
		// int n = 7;
		// System.out.println(happyNumber(n));
		// Expected: true

		// Test Case 5
		// int n = 4;
		// System.out.println(happyNumber(n));
		// Expected: false
	}
}
// Time Complexity = O(log n) ~ [ Logarithmic ]
// Space Complexity = O(log n) ~ [ Logarithmic ]