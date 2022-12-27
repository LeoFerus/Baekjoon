import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int n = 0;
		
		int k = 0;
		
		int cnt = 0;
		
		for(int i =0; i<t; i++) {
			n = sc.nextInt();
			
			k = sc.nextInt();
			
			int[] arr = new int [n];
			
			for(int j = 0; j<n;j++) {
				arr[j] = sc.nextInt();
				
				cnt = arr[j]/k+cnt;
			}
			System.out.println(cnt);
			cnt=0;
			
		}
		
		
	}
}