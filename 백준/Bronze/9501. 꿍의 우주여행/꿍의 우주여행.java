import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int n = 0;
		
		double d = 0;
		
		double v = 0;
		
		double f = 0;
		
		double c =0;
		
		int count = 0;
		
		for(int i = 0; i<t; i++) {
			n = sc.nextInt();
			
			d = sc.nextDouble();
			
			for(int j = 0 ; j<n; j++) {
				v = sc.nextDouble();
				
				f = sc.nextDouble();
				
				c = sc.nextDouble();
				
				
				if(d<=v*(f/c)) {
					count++;
					
				}
			}
		System.out.println(count);	
		count = 0;
		}
		
		sc.close();
	}	
}