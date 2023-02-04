import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
	       int cnt1 = 0;
	       int cnt2 = 0;
		for(int i = 0; i<3; i++) {
			int a = sc.nextInt();
			if(a==1) {
				cnt1++;
			}
			else {
				cnt2++;
			}
		}
		if(cnt1>cnt2) {
			System.out.println(1);
		}
		else {
			System.out.println(2);
		}
		sc.close();
	
		
		
		
	}
}