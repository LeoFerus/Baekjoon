import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int countU = 0;
		
		int countC = 0;
		
		String[] s = str.split("");
		
		for(int i = 0 ; i<s.length;i++) {
			if(s[i].equals(":")) {
				countC++;
			}
			if(s[i].equals("_")) {
				countU++;
			}
		}
		
		System.out.println(s.length+countC+(countU*5));
	}
 
}
