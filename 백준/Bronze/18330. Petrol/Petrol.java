import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		
		int t = (k+60)-n;
		
		if(t>=0) {
			System.out.println(n*1500);
		}
		else {
			System.out.println((k+60)*1500+(n-k-60)*3000);
		}
	
		sc.close();
}	
}