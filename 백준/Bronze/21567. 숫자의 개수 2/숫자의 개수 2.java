import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		
		long b = sc.nextLong();
		
		long c = sc.nextLong();
		

		
		String str = Long.toString(a*b*c)+"";
		
		
		long[] digit = new long[10];
		
		for(int i = 0 ;i<str.length();i++) {
			
			digit[str.charAt(i)-48]++;
			
		}
		
		String result = "";
		
		for( int i = 0 ;i<digit.length;i++) {
			result = result+digit[i];
			if(i != digit.length-1) {
				result = result+"\n";
			}
		}
		System.out.print(result);
		
	}

}
