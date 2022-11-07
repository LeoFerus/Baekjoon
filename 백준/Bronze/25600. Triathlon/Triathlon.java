import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
	
		int n = sc.nextInt();
		
		int a = 0;
		int d = 0;
		int g = 0;
		int compare = 0;
		int total = 0;
		
		for(int i = 0; i < n ; i++) {
			a = sc.nextInt();
			
			d = sc.nextInt();
			
			g = sc.nextInt();
			
			
			
			if(a==(d+g)) {
				compare = 2*(a*(d+g));
			}
			else {
				compare = a*(d+g);
			}
			
			if(compare> total) {
				total = compare;
			}
		}
		System.out.println(total);
		sc.close();
	}	
}