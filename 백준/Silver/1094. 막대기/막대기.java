import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int x  = sc.nextInt();
		
		int bar = 64;
		
		int count = 0;
		
		while(x>0) {
			
			if(bar>x){
				bar = bar/2;
			}
			else {
				count++;
				x = x - bar;
			}
		}
		
		System.out.println(count);
		
		
	}

}
