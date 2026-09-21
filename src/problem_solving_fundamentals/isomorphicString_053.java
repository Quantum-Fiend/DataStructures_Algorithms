package problem_solving_fundamentals;

import java.util.HashMap;

public class isomorphicString_053 {
	public static boolean isomorphicString(String s, String t) {

		HashMap<Character, Character> mapST = new HashMap<>();
		HashMap<Character, Character> mapTS = new HashMap<>();

		if (s.length() != t.length())
			return false;

		for (int i = 0; i < s.length(); i++) {
			char charS = s.charAt(i);
			char charT = t.charAt(i);

			if (mapST.containsKey(charS)) {
				if (mapST.get(charS) != charT)
					return false;
			} else
				mapST.put(charS, charT);

			if (mapTS.containsKey(charT)) {
				if (mapTS.get(charT) != charS)
					return false;
			} else
				mapTS.put(charT, charS);
		}

		return true;
	}

	public static void main(String[] args) {

		// Test Case 1
		String s = "egg";
		String t = "add";
		System.out.println(isomorphicString(s, t));
		// Expected: true

		// Test Case 2
		// String s = "foo";
		// String t = "bar";
		// System.out.println(isomorphicString(s, t));
		// Expected: false

		// Test Case 3
		// String s = "paper";
		// String t = "title";
		// System.out.println(isomorphicString(s, t));
		// Expected: true

		// Test Case 4
		// String s = "ab";
		// String t = "cc";
		// System.out.println(isomorphicString(s, t));
		// Expected: false

		// Test Case 5
		// String s = "aab";
		// String t = "xxy";
		// System.out.println(isomorphicString(s, t));
		// Expected: true

	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(1) ~ [ Constant ]