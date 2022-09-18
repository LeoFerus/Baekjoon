import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();

		int b = sc.nextInt();

		int t = r+b;
		
		int l =0;
		int w =0;
		for(int i = 3; i<t; i++) {
			for(int j = 1; j<t; j++) {
			

				if(i*j==t&&(i*2)+(j-2)*2==r) {
					if(i>j) {
						 l =i;
						w =j;
					}
					else {
						 l =j;
						 w =i;
					
					}
					System.out.println(l+" "+w);
					sc.close();
					i = t-1;
				}
			}
		}

		

	}

}