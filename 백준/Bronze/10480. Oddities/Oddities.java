import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int t =sc.nextInt();
		
		int  x = 0;
		
		for(int i = 0; i<t; i++) {
			x = sc.nextInt();
		
			if(x%2==0) {
			System.out.println(x+" is even");}
			else {
				System.out.println(x+" is odd");
			}
		}
		sc.close();
		
		
	}
}