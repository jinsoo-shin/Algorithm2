import java.util.*;

public class Solution_1986 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int ans = 0;
			int N = sc.nextInt();
			for (int i = 1; i <= N; i++) {
				if (i % 2 == 0) {
					ans -= i;
				} else {
					ans += i;
				}
			}

			System.out.println("#" + tc + " " + ans);
		}

	}

}
