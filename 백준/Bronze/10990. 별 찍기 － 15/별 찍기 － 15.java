import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		int j =1;
		
		for(int i = n; i>0; i--) {
			System.out.print(" ".repeat(i-1)+"*");
			if(i==n) {
			System.out.println();
			}
			else if(i==n-1) {
				System.out.println(" ".repeat(j)+"*");
			}
			else {
				j = j+2;
				System.out.println(" ".repeat(j)+"*");
			
			}
		}
		sc.close();
	}
}