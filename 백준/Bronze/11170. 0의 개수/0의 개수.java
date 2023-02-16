import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			int n = sc.nextInt();
			
			int m = sc.nextInt();
			
			int cnt = 0;
			
			for(int j = n; j <= m; j++) {
				String s = Integer.toString(j);
				
				String[] str = s.split("");
				
				for(int k = 0 ; k<str.length;k++) {
					if(str[k].equals("0")) {
						cnt++;
					}
				}
			}
			
			
	

			System.out.println(cnt);
		 
		}
 		sc.close();
	
		
		
		
	}
}