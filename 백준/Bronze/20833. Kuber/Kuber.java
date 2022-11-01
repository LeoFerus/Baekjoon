import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double total = 0;
		
		for(int i = 1; i <=n; i++) {
			total =Math.pow(i,3)+total;
		}
		
		System.out.println(Math.round(total));
		sc.close();
}	
}