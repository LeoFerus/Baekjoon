
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] str = sc.next().split("");
		
		
		for(int i = n-5; i<n;i++) {
			System.out.print(str[i]);
		}
	}

}