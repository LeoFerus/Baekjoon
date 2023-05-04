import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		int [] arr= new int [n+1];
		
		int A = 0;
		
		int B = 0;
		
		for(int i = 0 ;i<m; i++) {
			
			A = sc.nextInt();
			
			B = sc.nextInt();
			
			arr[A]++;
			arr[B]++;
		}
		
		for(int i = 1 ; i<=n;i++) {
			System.out.println(arr[i]);
		}

	}
}
