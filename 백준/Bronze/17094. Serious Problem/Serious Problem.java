import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		char [] arr = new char [n];
		
		String word = sc.next();
		
		int countE = 0;
		
		int count2 = 0;
		
		for(int i = 0; i<arr.length; i++) {
			
			arr[i] = word.charAt(i);
			if(arr[i] == '2') {
				count2++;
			}
			else {
				countE++;
			}
			
		}
		
		if(count2==countE) {
			System.out.println("yee");
			
		}
		else if(count2<countE) {
			System.out.println("e");
		}
		else {
			System.out.println("2");
		}
		

		
	}

}
