import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		long a = sc.nextLong();
		
		if(n>5) {
			System.out.println("Love is open door");

		}
		else {
	        for(int i=0 ; i < n-1 ; i++){
	        	
	        	System.out.println(a ^= 1);
	        }
		}
		
	}
}
