import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		 
		int b = sc.nextInt();
		
		int p = 5*b-400;
		
		System.out.println(p);
		
		if(100-p==0) {
			System.out.println(0);
		}
		else if(100-p>0) {
			System.out.println(1);
		}
		else {
			System.out.println(-1);
		}
	}
}