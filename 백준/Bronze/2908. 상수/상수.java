import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int reverse1 = 0;
		int reverse2 = 0;
		
		
		while (num1 != 0) {
			int digit = num1 % 10;
			reverse1 = reverse1 * 10 + digit;
			num1 /= 10;
		}
		
		while (num2 != 0) {
			int digit = num2 % 10;
			reverse2 = reverse2 * 10 + digit;
			num2 /= 10;
			
		}
			
			if(reverse1>reverse2) {
				System.out.println(reverse1);
			}
			
			else {
				System.out.println(reverse2);
			}
		
	}
 
}
