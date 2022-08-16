import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		double a = sc.nextInt();
		
		double b = sc.nextInt();
		
		double m = (b-a)/400;
		
		double v = 1/(1+Math.pow(10, m));
		
		System.out.println(v);
		
		sc.close();
	}
 
}