import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		String str = sc.nextLine();
		
		if(str.equals("***")) {
			break;
		}
		String[] s = str.split("");
	
		for(int i = s.length-1; i>=0;i--) {
			System.out.print(s[i]);
		}
		System.out.println();
		}
	}
}
