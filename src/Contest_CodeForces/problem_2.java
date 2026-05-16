package Contest_CodeForces;
import java.util.*;

public class problem_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();
			int x1 = sc.nextInt();
			int x2 = sc.nextInt();
			int k = sc.nextInt();

			int d = Math.abs(x1 - x2);

			d = Math.min(d, n - d);

			int answer;

			if (2 * d == n) {
				answer = d;
			} else {
				answer = d + k;
			}

			System.out.println(answer);
		}
	}
}
