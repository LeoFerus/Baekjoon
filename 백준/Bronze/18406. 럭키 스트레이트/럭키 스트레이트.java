import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		String[] str = s.split("");
		
		int cntL = 0;
		
		int cntR = 0;
		
		for(int i = 0; i < str.length/2;i++) {
			
		   cntL = cntL+ Integer.parseInt(str[i]);
		}
		
		for(int i = str.length/2; i < str.length;i++) {
			
			   cntR = cntR+ Integer.parseInt(str[i]);
			}
		
		
		if(cntL==cntR) {
			System.out.println("LUCKY");
		}
		else {
			System.out.println("READY");
		}
 		sc.close();
	
		
		
		
	}
}