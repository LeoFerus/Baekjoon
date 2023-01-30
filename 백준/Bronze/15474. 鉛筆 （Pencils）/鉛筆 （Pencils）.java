import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		int d = sc.nextInt();
		
		int cntA = 1;
		
		int cntC = 1;
		
		int x = a;
		
		int y = c;
		
		while(true) {
			
			if(n>a) {
				a = x+a;
				cntA++;
			}
			else {
				cntA = cntA*b;
				break;
			}
		
		}
		while(true) {
			if(n>c) {
				c = y+c;
				cntC++;
			}
			else {
				cntC = cntC*d;
				break;
			}
		}
		
		if(cntA>=cntC) {
			System.out.println(cntC);
		}
		else {
			System.out.println(cntA);
		}

		sc.close();
	
		
		
		
	}
}