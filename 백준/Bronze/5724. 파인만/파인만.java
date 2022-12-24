import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n  = sc.nextInt();
			
			int sum = 0;
			
			if(n ==0) {
				sc.close();
				break;
			}
			for(int i = 1; i<=n;i++) {
				sum += i*i;
			}
			System.out.println(sum);
			
		}
	}
}