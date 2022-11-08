import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		double a  = sc.nextDouble();
		
		double b = sc.nextDouble();
		
		while(true) {
			
			if(b==999) {
				break;
			}
			System.out.printf("%.2f\n",b-a);
			
			a = b;
			
			b = sc.nextDouble();
			
		}
		sc.close();
	}	
}