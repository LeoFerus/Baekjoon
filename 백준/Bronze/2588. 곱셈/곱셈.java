import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] x = sc.next().split("");
		
		String [] y = sc.next().split("");
		
		
		int x1 = Integer.parseInt(x[0])*100;
		
		int x2 = Integer.parseInt(x[1])*10;
		
		int x3 = Integer.parseInt(x[2]);
		
		int y1 = Integer.parseInt(y[0]);
		
		int y2 = Integer.parseInt(y[1]);
		
		int y3 = Integer.parseInt(y[2]);
		
		
		int z1 =x3*y3+x2*y3+x1*y3;
		
		int z2 = x3*y2+x2*y2+x1*y2;
		
		int z3 = x3*y1+x2*y1+x1*y1;
		

		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z1+z2*10+z3*100);
		
		
	}
 
}
