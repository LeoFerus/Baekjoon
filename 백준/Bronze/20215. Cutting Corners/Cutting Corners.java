import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		
		int h = sc.nextInt();
		
		double len = w + h -  Math.sqrt(h*h + w*w);
		
		System.out.println(len);
	}
}
