import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i<t; i++) {
			int n = sc.nextInt();
			
			String[] str = sc.next().split("");
			
			str[n-1] = "";
			
			for(String s: str) {
				System.out.print(s);
			}
			System.out.println("");
		}
		sc.close();
		
	}

}