import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		if(n%5==0) {
			System.out.println(n/5);
		}
		else {
			System.out.println(n/5+1);
		}
	}
	

}
