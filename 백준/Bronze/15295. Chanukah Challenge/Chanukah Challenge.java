import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0 ; i<t;i++) {
			
			int k = sc.nextInt();
			
			int n = sc.nextInt();
			
			int sum =0;
			for(int j = 1; j<=n; j++) {
				sum = sum+j;
				sum++;
			}
			
			System.out.println(k+" "+sum);
			
		}
	}
}
