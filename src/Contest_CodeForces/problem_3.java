package Contest_CodeForces;

import java.io.*;
import java.util.*;

public class problem_3 {

	static long ans;

	static void dfs(char[] digits, int idx, StringBuilder sb, long a, int maxLen) {
		if (idx > maxLen)
			return;

		if (sb.length() > 0) {
			if (!(sb.length() > 1 && sb.charAt(0) == '0')) {
				long num = Long.parseLong(sb.toString());
				ans = Math.min(ans, Math.abs(a - num));
			}
		}

		for (char c : digits) {
			sb.append(c);
			dfs(digits, idx + 1, sb, a, maxLen);
			sb.deleteCharAt(sb.length() - 1);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			int n = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());

			char[] digits = new char[n];
			for (int i = 0; i < n; i++) {
				digits[i] = st.nextToken().charAt(0);
			}

			ans = Long.MAX_VALUE;

			int len = String.valueOf(a).length();

			dfs(digits, 0, new StringBuilder(), a, len + 1);

			out.append(ans).append('\n');
		}

		System.out.print(out);
	}
}
