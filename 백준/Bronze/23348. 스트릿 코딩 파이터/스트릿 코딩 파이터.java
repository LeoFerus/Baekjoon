import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		int B = sc.nextInt();
		
		int C = sc.nextInt();
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
	
		
		int a,b,c = 0;
		
		for(int i  = 0; i<n; i++) {
			for(int j = 0; j<3;j++) {
			a= sc.nextInt();
			
			b = sc.nextInt();
			
			c = sc.nextInt();
			
			arr[i] = A*a + B*b + C*c+arr[i];
			}
		}
				
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
	 
		

		sc.close();
		
	}

}	