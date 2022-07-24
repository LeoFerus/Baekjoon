import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		long k = sc.nextInt();
		
		long n = sc.nextInt();
		
		long x = 0;
		
		if(n<=1) {
			 x = -1;
		}
		else{
		 x = n*k/(n-1);
		}
		
		if(x-k>=0) {
			if((n*k)%(n-1)!=0) {
				System.out.println(x+1);
			}
			else {
			System.out.println(x);
			}
		}
		else {
			System.out.println(-1);
		}
		
		sc.close();
	}
}