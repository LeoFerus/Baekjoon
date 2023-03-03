import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		
		String[] s = n.split("");
		
		Double sum = 0.0; 
		
		for(int i = 0 ; i<s.length;i++) {
			
			int temp = Integer.parseInt(s[i]);
			
			sum = sum + Math.pow(temp, 5);
		}
		
		
		System.out.println(sum.intValue());
		
		
		
	}
}