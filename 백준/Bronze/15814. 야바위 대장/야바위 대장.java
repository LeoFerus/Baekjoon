import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		String[] s = sc.nextLine().split("");
		
		int t = sc.nextInt();
		
		for(int i = 0 ;i<t; i++) {
			
			int a = sc.nextInt();
			
			int b = sc.nextInt();
			
			String temp = s[a];
			
			s[a] = s[b];
			
			s[b] = temp;
			
		}
		for(int i = 0 ;i<s.length;i++) {
			System.out.print(s[i]);
		}
		

	}
}
