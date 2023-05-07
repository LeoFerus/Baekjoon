import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		double x =sc.nextInt();
		
		System.out.println((100-x)/x+1);
		
		System.out.println((x/(100-x)+1));

	}
}
