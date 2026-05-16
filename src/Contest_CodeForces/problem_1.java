package Contest_CodeForces;
import java.util.*;

public class problem_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();

			int c0 = 0, c1 = 0, c2 = 0;

			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();

				if (x == 0)
					c0++;
				else if (x == 1)
					c1++;
				else
					c2++;
			}

			int pairs = Math.min(c1, c2);

			c1 -= pairs;
			c2 -= pairs;

			int ans = c0 + pairs + (c1 / 3) + (c2 / 3);

			System.out.println(ans);
		}
		sc.close();
	}
}
