import java.util.*;
public class Solution_1979 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		int ans;
		for(int tc=1;tc<=T;tc++) {
			ans=0;
			int N=sc.nextInt(); //가로 세로
			int K=sc.nextInt(); //단어길이
			int[][] arr= new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			//입력 끝
			//흰색 1 검 0
			
			int rowcnt=0;
			int colcnt=0;
			//행 탐색
			for(int i=0;i<N;i++) {
				rowcnt=0;
				colcnt=0;
				for(int j=0;j<N;j++) {
					if(arr[i][j]==1) {
						rowcnt++;
					}else {
						if(rowcnt==K) {
							ans++;
						}
						rowcnt=0;//초기화
					}
					
					if(arr[j][i]==1) {
						colcnt++;
					}else {
						if(colcnt==K) {
							ans++;
						}
						colcnt=0;
					}
				}
				if(colcnt==K) {
					ans++;
				}
				if(rowcnt==K) {
					ans++;
				}
			}
			
			
			System.out.println("#"+tc+" "+ans);
		}
	}

}
