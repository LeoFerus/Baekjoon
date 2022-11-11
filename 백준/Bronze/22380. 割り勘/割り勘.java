import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		int m = 0;
		
		int a = 0;
		
		int total = 0;
		
		while(true) {
			
			n = sc.nextInt();
			
			m = sc.nextInt();
			
			if(m == 0 && n == 0) {
				break;
			}
			
			for(int i = 0; i<n; i++) {
				a = sc.nextInt();
				
				if(m/n>a) {
				
				total = a + total;
				}
				else {
					total = m/n+total;
				}
			}
			System.out.println(total);
			
			total = 0;
			
		}
		

		sc.close();
	}	
}