import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextInt();
		
		long m = scan.nextInt();
		
		long r = n - m;
		
		if(r<0) {
			System.out.println(r*-1);
		}
		else {
			System.out.println(r);
		}
		
		scan.close();

	}

}