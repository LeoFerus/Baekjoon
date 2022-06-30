import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		
		double b = sc.nextInt();
		
		a = a-(a/100*b);
		
		if(a>=100) {
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}
				
		
		
		sc.close();
	}

}
