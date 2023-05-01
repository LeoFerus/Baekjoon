import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		divisiors(sc.nextInt());
		
	}
	
	public static void divisiors(int n) {
		int result = 0;
		for(int i = 1 ;i<n+1;i++) {
			if(n%i==0) {
				result = result+i;
			}
		}
		System.out.println(result);
	}
 
}
