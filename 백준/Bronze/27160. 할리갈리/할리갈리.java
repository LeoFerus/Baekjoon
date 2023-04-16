import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] arrS= new String[4];
		
		int [] arrI = new int [4];
		
				
		for(int i =0;i<n;i++) {
			String s= sc.next();
			
			if(s.equals("STRAWBERRY")) {
				arrI[0] = arrI[0]+sc.nextInt();
			}
			if(s.equals("BANANA")) {
				arrI[1] = arrI[1]+sc.nextInt();
			}
		    if(s.equals("LIME")) {
				arrI[2] = arrI[2]+sc.nextInt();
			}
			if(s.equals("PLUM")) {
				arrI[3] = arrI[3]+sc.nextInt();
			}
			

			
		}
		if(arrI[0]==5||arrI[1]==5||arrI[2]==5||arrI[3]==5) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
