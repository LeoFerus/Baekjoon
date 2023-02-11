import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int s = sc.nextInt();
		
		int h = sc.nextInt();
		
		for(int i = 0 ; i <t ; i++) {
			System.out.println("*"+" ".repeat(s)+"*"+" ".repeat(s)+"*");
		}
		System.out.println("*".repeat(3+s*2));
		for(int i = 0 ; i<h; i++) {
		System.out.println(" ".repeat(1+s)+"*");
		}
		sc.close();
	
		
		
		
	}
}