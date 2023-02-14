import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if((1996<=n&&n<=1997)||n==2000||(2007<=n&&n<=2008)||n==2013||n==2018)
		{
			System.out.println("SPbSU");
		}
		else if(n==2006) {
			System.out.println("PetrSU, ITMO");
		}
		else {
			System.out.println("ITMO");
		}
		sc.close();
	
		
		
		
	}
}