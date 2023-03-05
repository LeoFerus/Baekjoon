import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int ans =1, ans2 = 1;
		
		boolean check = false;
		
		for(int i = 0; i<3; i++) {
			int a = sc.nextInt();
			
			if(a%2==1) {
				ans = a*ans;
				
				if(!check) {
					check = true;
					
				}
			}
			ans2 = ans2*a;
		}
		System.out.println(check ? ans : ans2);
		
	}
}