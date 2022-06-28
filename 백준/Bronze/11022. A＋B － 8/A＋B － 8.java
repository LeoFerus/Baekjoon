import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int i = 1;
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a+b;
			System.out.printf("Case #%d: "+"%d + %d = %d",i,a,b,c);
			System.out.println();
			i=i+1;
		}
		
		sc.close();

	}

}