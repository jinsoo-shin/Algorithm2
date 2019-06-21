import java.util.*;
public class Solution_1966 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N=sc.nextInt();
			int[] arr=new int[N];
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
			}
			
			Arrays.sort(arr);
			StringBuilder sb= new StringBuilder();
			sb.append("#"+tc);
			for(int i=0;i<N;i++) {
				sb.append(" "+arr[i]);
			}
			System.out.println(sb.toString());
		}
	}

}
