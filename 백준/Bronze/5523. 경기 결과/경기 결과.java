import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = 0;
		
		int b = 0;
		
		int countA = 0;
		
		int countB = 0;
		
		for(int i = 0; i< n ; i++) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			if(a>b) {
				countA++;
			}
			if(a<b){
				countB++;
			}
		}

		System.out.println(countA+" "+countB);
		
		sc.close();
		

		
	}

}	