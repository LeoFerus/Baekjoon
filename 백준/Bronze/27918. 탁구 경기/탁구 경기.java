import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int x= 0;
		
		int y = 0;
		
		int s = 0;
		
		for( int i = 0 ;i<n;i++) {
			
			String str = sc.next();
			
			if(str.equals("D")) {
				x++;
			}
			else {
				y++;
			}
			if(s == 0)
				if(Math.abs(x-y)==2) {
					System.out.println(x + ":" + y);
					System.out.println();
					s = 1;
				}
		}

	if(s == 0) {
		System.out.println(x+":"+y);
		System.out.println();
	}
	}
}
