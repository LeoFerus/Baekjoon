import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();
		
		for(int i = 0; i<t; i++) {
			int n =sc.nextInt();
			
			int result = 0;
			
			for(int j = 1; j<=n; j++) {
				result = result+ j*(j+1)*(j+2)/2 ;
			}
			System.out.println(result);
		}
		

	}
}
