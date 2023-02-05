import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		double r = 1.00;
		int n = sc.nextInt();
		int sum  =0 ;
		if(n==0) {
			System.out.println("divide by zero");
		}
		else {
			for(int i = 0; i<n; i++) {
				int x =sc.nextInt();
				sum = sum+x;
			}
			if(sum ==0) {
				System.out.println("divide by zero");
			}
			else{{
				System.out.printf("%.2f", r);
			}
		}
		}
		
		sc.close();
	
		
		
		
	}
}