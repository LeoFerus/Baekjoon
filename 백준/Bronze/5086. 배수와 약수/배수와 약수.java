import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int x= sc.nextInt();
			
			int y = sc.nextInt();
			
			if(x==0&&y==0) {
				break;
			}
			
			if(y%x==0) {
				System.out.println("factor");
			}
			else if(x%y==0) {
				System.out.println("multiple");
				
			}
			else {
				System.out.println("neither");
			}
		}
		
	}

}
