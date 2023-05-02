import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int index = 0;
		
		String result = "";
		
		while(true) {
			char c = str.charAt(index);
			result = result+c;
			index  = index+c - 64;
		
			if(index>str.length()-1) {
				break;
			}
		}
		System.out.println(result);

	}
}
