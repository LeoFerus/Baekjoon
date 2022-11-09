import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i  = 0 ; i<2*n ; i++) {
			System.out.println("@".repeat(n)+"   ".repeat(n)+"@".repeat(n));
		}
		
		for(int i = 0; i<n; i++) {
			System.out.println("@".repeat(n*5));
		}
		for(int i = 0; i<n; i++) {
			System.out.println(("@".repeat(n)+"   ".repeat(n)+"@".repeat(n)));
		}
		for(int i = 0; i<n; i++) {
			System.out.println("@".repeat(n*5));
		}
		sc.close();
	}	
}