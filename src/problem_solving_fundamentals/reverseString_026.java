package problem_solving_fundamentals;

public class reverseString_026 {
	public static void main(String[] args) {

		// Test Case 1
		String str = "hello";
		// Expected: "olleh"

		// Test Case 2
		// String str = "Java";
		// Expected: "avaJ"

		// Test Case 3
		// String str = "a";
		// Expected: "a"

		// Test Case 4
		// String str = "hello world";
		// Expected: "dlrow olleh"

		// Test Case 5
		// String str = "abc123";
		// Expected: "321cba"

		StringBuilder sb = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb);
	}
}
// Time Complexity = O(n) ~ [ Linear ]
// Space Complexity = O(n) ~ [ Linear ]