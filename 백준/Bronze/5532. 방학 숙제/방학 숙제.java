import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		
		if((a/c)<(b/d)) {
			if(b%d!=0) {
				System.out.println(l-((b/d)+1));
			}
			else {
				System.out.println(l-(b/d));
			}
		}
		
		else {
			if(a%c!=0) {
				System.out.println(l-((a/c)+1));
			}
			else {
				System.out.println(l-(a/c));
			}
		}
		

		sc.close();
	}

}
