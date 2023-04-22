import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		String arr[] = new String [t];
		
		for(int i = 0 ; i < t; i++) {
			arr[i] = sc.next();
		}
		
		int count = 0;
		
		for(int i = 0 ; i<t; i++) {
			if(arr[i].equals(sc.next())) {
				count++;
			}
		}
		
		System.out.println(count);

		
	}

}
