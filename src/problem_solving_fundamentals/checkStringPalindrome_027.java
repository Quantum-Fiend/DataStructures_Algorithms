package problem_solving_fundamentals;

public class checkStringPalindrome_027 {
	public static void main(String[] args) {

		// Test Case 1
		String str = "madam";
		// Expected: true

		// Test Case 2
		// String str = "hello";
		// Expected: false

		// Test Case 3
		// String str = "a";
		// Expected: true

		// Test Case 4
		// String str = "racecar";
		// Expected: true

		// Test Case 5
		// String str = "java";
		// Expected: false

		boolean isPalindrome = true;

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				isPalindrome = false;
			}
		}
		System.out.println(isPalindrome);
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(1) ~ [ Constant ]