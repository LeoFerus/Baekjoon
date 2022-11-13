import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String str = sc.next();
		
		String[] alphabet = str.split("");
		
		int total = 0;
		
		for(int i = 0; i < n ; i++) {
			total = (alphabet[i].charAt(0)-64)+total;
		}
		System.out.println(total);
		sc.close();
	}	
}