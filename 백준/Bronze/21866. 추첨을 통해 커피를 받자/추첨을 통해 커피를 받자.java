import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 100;
		
		int sum = 0;
		
		int f = 0;
		
		for(int i = 0 ;i<9;i++) {
			int n = sc.nextInt();
			
			if(i%2 == 0&& i !=0) {
				num = num+100;
			}
			sum = sum+n;
			if(n>num) {
				System.out.println( "hacker");
				f++;
				break;
			}
			if(sum>=100) {
				System.out.println("draw");
				
				break;
			}
			
		}
		
		if(f==0&&sum<100) {
			System.out.println("none");
		}
		
		
		
		sc.close();
	
		
		
		
	}
}