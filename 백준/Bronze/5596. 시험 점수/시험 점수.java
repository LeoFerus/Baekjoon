import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = 0;
		
		int t = 0;
	  
		for(int i = 0; i<4;i++) {
			
			int a = sc.nextInt();
			s = s+a;
			
		}
		
		for(int i =0; i<4; i++) {
			int a = sc.nextInt();
			t = t+a;
		}
		if(s>=t) {
			System.out.println(s);
		}
		else {
			System.out.println(t);
		}

	}

}