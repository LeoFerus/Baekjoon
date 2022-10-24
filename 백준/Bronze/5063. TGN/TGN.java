import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int r,e,c =0;
		for(int i = 0; i<t; i++) {
			r = sc.nextInt();
			e = sc.nextInt();
			c = sc.nextInt();
			if(r<e-c) {
				System.out.println("advertise");
			}
			else if (r==e-c) {
				System.out.println("does not matter");
			}
			else {
				System.out.println("do not advertise");
			}
			
		}
		
		
		
		
		
		sc.close();
		

		
	}

}	