import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int w = sc.nextInt();
		
		int h = sc.nextInt();
		
		int l = sc.nextInt();
		
		int cow = (w /l)*(h/l);
		
		if(cow >= n) {
			System.out.println(n);
		}
		else {
			System.out.println(cow);
		}

	}

}
