import java.util.*;

public class Solution_2007 {
	// 마디의 길이를 출력하는 프로그램
	public static void main(String[] args) {
//		String src = "3\r\n" + "KOREAKOREAKOREAKOREAKOREAKOREA\r\n" + "SAMSUNGSAMSUNGSAMSUNGSAMSUNGSA\r\n"
//				+ "GALAXYGALAXYGALAXYGALAXYGALAXY";
		String src = "10\r\n" + "KOREAKOREAKOREAKOREAKOREAKOREA\r\n" + "SAMSUNGSAMSUNGSAMSUNGSAMSUNGSA\r\n"
				+ "GALAXYGALAXYGALAXYGALAXYGALAXY\r\n" + "EXOEXOEXOEXOEXOEXOEXOEXOEXOEXO\r\n"
				+ "B1A4B1A4B1A4B1A4B1A4B1A4B1A4B1\r\n" + "APINKAPINKAPINKAPINKAPINKAPINK\r\n"
				+ "BLACKPINKBLACKPINKBLACKPINKBLA\r\n" + "TWICETWICETWICETWICETWICETWICE\r\n"
				+ "REDVELVETREDVELVETREDVELVETRED\r\n" + "ABCABCABCABCABCABCABCABCABCABC";
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(src);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int ans = 10;

			String str = sc.next();
			for (int len = 1; len < 10; len++) {
				String tmp = str.substring(0, len);
//				System.out.println(tmp);
				String[] arr = str.split(tmp);
//				System.out.println(Arrays.toString(arr));
				if (arr.length == 0) {
					ans = len;
					break;
				} else {
					for (int j = 0; j < arr.length; j++) {
						if (j == arr.length - 1 && arr[j].length() != 0) {
							if(ans==10) {
								ans = len;
								break;
							}
						}
						if (arr[j].length() == 0) {
							continue;
						} else {
							break;
						}

					}
				}
			}

			System.out.println("#" + tc + " " + ans);
		}
	}

}
