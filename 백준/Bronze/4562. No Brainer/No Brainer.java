import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int x,y=0;
		
		for(int i = 0; i<t; i++) {
		 x = sc.nextInt();
		
		 y = sc.nextInt();
		 
		 if(x>=y) {
			 System.out.println("MMM BRAINS");
		 }
		 else {
			 System.out.println("NO BRAINS");
		 }
		
		}
		
		sc.close();
	
		
		
		
	}
}