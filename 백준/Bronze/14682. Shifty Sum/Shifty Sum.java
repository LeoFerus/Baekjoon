import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		
		int temp = n;
		
		long result =0;
		
		for(int i = 0 ;i<k;i++) {
			
			
			result +=( temp *=10) ;
			
		}
		System.out.println(result+n);
	}

}
