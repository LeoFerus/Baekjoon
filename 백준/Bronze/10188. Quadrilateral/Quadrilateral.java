import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int t =sc.nextInt();
		
		int  a,b= 0;
		
		for(int i = 0; i<t; i++) {
		 a = sc.nextInt();
		 
		 b = sc.nextInt();
		 
		 for(int j = 0; j<b;j++) {
			System.out.println("X".repeat(a));
		 }
		 System.out.println();
		}
		sc.close();
		
		
	}
}