import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		int w = sc.nextInt();
		
		int m = sc.nextInt();
		
		int cnt = 0;
		
		while(true) {
			
			if(k>=w) {
				break;
			}
			k = k+m;
			cnt++;
		}
		System.out.println(cnt);
		sc.close();
	
		
		
		
	}
}