import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		

		int t = sc.nextInt();
		
		
		
		
		for(int k = 0; k<t;k++) {
			
			int n = sc.nextInt();
			
			String winner = "";
			
			int max = 0;
			for(int i = 0 ;i<n;i++) {
			
				String s= sc.next();
			
				int l = sc.nextInt();
			
				if(l>max) {
					max = l;
					winner = s;
				}
				}
			System.out.println(winner);
			}
			
	}
}
