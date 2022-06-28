import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int p = a+b;
		
		int m = a-b;
		
		if(p<m) {
			System.out.println(m);
			System.out.println(p);
		}
		
		else {
			System.out.println(p);
			System.out.println(m);
		}
		
		
		sc.close();

	}

}
