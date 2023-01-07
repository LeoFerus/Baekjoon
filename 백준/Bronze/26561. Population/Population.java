import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int p,t =0;
		
		for(int i = 0; i<n; i++) {
			p = sc.nextInt();
			
			t = sc.nextInt();
			
			p = p+(t/4)-(t/7);
			System.out.println(p);
		}
		
	}
}