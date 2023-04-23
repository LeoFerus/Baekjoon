import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for( int i = 0 ;i<t;i++){
			int a =sc.nextInt();
			
			int b = sc.nextInt();
			
			if((a<=2&&b<=1)||(a<=1&&b<=2)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}

		
	}

}
