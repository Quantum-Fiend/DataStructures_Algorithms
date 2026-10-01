package problem_solving_fundamentals;

public class validPalindromeUsingTwoPointer_061 {
	public static boolean validPalindromee(String s) {

		int left = 0, right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {

		// Test Case 1
		String s = "racecar";
		System.out.println(validPalindromee(s));
		// Expected: true

		// Test Case 2
		// String s = "hello";
		// System.out.println(validPalindromee(s));
		// Expected: false

		// Test Case 3
		// String s = "a";
		// System.out.println(validPalindromee(s));
		// Expected: true

		// Test Case 4
		// String s = "abccba";
		// System.out.println(validPalindromee(s));
		// Expected: true

		// Test Case 5
		// String s = "abcde";
		// System.out.println(validPalindromee(s));
		// Expected: false
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Compelxity = O(1) ~ [ Constant ]