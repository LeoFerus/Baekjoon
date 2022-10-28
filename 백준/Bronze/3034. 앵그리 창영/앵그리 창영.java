import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		int w = sc.nextInt();
		
		int h = sc.nextInt();
		
		double c = Math.pow(w,2)+Math.pow(h,2);
		
		int match = 0; 
		
		for(int i = 0; i< n ; i++) {
			match = sc.nextInt();
			
			if(Math.pow(match,2)<=c) {
				System.out.println("DA");
			}
			else {
				System.out.println("NE");
			}
		}

}	
}