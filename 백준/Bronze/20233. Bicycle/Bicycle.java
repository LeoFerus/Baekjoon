import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int x = sc.nextInt();
		
		int b = sc.nextInt();
		
		int y = sc.nextInt();
		
		int t = sc.nextInt();
		
		int opt1= 0;
				
		int opt2 = 0;
		
		
		
		if(t>30) {
		     opt1 = a + (t -30)*x*21;
		}
		else {
			 opt1 = a;
		}
		
		if(t>45) {
			 opt2 = b + (t - 45)*y*21;
		}
		else {
			 opt2 = b;
		}
	
		
		System.out.println(opt1+" "+opt2);
	}

}
