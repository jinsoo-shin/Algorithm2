import java.util.*;

public class Solution_1989 {
   
	public static void main(String[] args) {

		String src="3\r\n" + 
				"level\r\n" + 
				"samsung\r\n" + 
				"eye";
		Scanner sc= new Scanner(src); 
//		Scanner sc= new Scanner(System.in); 
		int T= sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int ans=1;
			
			String str=sc.next();
			for(int i=0;i<str.length()/2;i++) {
				if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
					ans=0;
					break;
				}
			}
			
			
			
			System.out.println("#"+tc+" "+ans);
		}
	}

}
