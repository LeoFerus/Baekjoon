import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int z = n;
		
		for(int i = 1; i<n; i++) {
			
		System.out.println(" ".repeat(z-i)+"*".repeat(i));
		}
		System.out.println("*".repeat(n));
		
		for( int i = 1; i<n; i++) {
		System.out.println(" ".repeat(i)+"*".repeat(z-i));
		}
		sc.close();
		
	}

}	