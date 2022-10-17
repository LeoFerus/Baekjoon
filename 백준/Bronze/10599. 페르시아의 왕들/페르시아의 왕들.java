import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int a = sc.nextInt();
			
			int b = sc.nextInt();
			
			int c = sc.nextInt();
			
			int d = sc.nextInt();
			
			
			
			if(a== 0&& b==0&& c==0&& d==0) {
				sc.close();
				break;
			}
			
			System.out.println(Math.abs(c-b)+" "+Math.abs(d-a));
		}
		

		
	}

}	