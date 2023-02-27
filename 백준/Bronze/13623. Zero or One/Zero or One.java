import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
	    if (a == 1 && b == 0 && c == 0) System.out.printf("A\n");
	    else if (a == 0 && b == 1 && c == 1) System.out.printf("A\n");
	    else if (a == 0 && b == 1 && c == 0) System.out.printf("B\n");
	    else if (a == 1 && b == 0 && c == 1) System.out.printf("B\n");
	    else if (a == 0 && b == 0 && c == 1) System.out.printf("C\n");
	    else if (a == 1 && b == 1 && c == 0) System.out.printf("C\n");
	    else System.out.printf("*\n");
		
	
		
		
	}
}