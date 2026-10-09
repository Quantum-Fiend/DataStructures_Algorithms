package problem_solving_fundamentals;

import java.util.HashSet;

public class checkDuplicates_034 {
	public static boolean containsDuplicateCharacters(String s) {

		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (set.contains(ch))
				return true;

			set.add(ch);
		}
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
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(n) ~ [ Linear ]
