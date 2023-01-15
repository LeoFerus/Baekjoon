import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		int total = 0;
		
		if(n>a) {
			total = total + a;
		}
		else {
			total = total +n;
		}
		if(n>b) {
			total = total + b;
		}
		else {
			total = total +n;
		}
		if(n>c) {
			total = total + c;
		}
		else {
			total = total +n;
		}
		
		System.out.println(total);
	
	}
}