package problem_solving_fundamentals;

public class checkDuplicates_034 {
	public static boolean containsDuplicateCharacters(String s) {
		return false;
	}

	public static void main(String[] args) {

		// Test Case 1
		String s = "leetcode";
		System.out.println(containsDuplicateCharacters(s));
		// Expected: true

		// Test Case 2
		// String s = "abcde";
		// System.out.println(containsDuplicateCharacters(s));
		// Expected: false

		// Test Case 3
		// String s = "aabbcc";
		// System.out.println(containsDuplicateCharacters(s));
		// Expected: true

		// Test Case 4
		// String s = "abcdefga";
		// System.out.println(containsDuplicateCharacters(s));
		// Expected: true

		// Test Case 5
		// String s = "a";
		// System.out.println(containsDuplicateCharacters(s));
		// Expected: false
	}
}
