import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	
		for(int i = 2*n-1; i>0; i=i-2) {
			System.out.println(" ".repeat((2*n-1-i)/2)+"*".repeat(i));
		}
		
		for(int i = 3; i<=2*n-1; i=i+2) {
			System.out.println(" ".repeat((2*n-1-i)/2)+"*".repeat(i));
		}
		sc.close();
	}
 
}