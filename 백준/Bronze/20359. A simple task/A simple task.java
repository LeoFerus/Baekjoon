import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 0;
		
		while(true) {
			
			if(n%2==0) {
				n=n/2;
				i++;
			}
			else {
				System.out.println(n+" "+i);
				break;
			}
		}
		
	}
}
