import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = 2*sc.nextInt();
		
		if(a+b<c) {
			System.out.println(a+b);
		}
		
		else {
			System.out.println((a+b)-c);
		}
		
		
		sc.close();
	}

}