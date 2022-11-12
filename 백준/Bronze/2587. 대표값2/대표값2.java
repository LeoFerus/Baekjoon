import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int [5];
		
		int total = 0;
		
		for(int i = 0; i<5; i++) {
			arr[i] = sc.nextInt();
			total = total + arr[i];
		}
		
		Arrays.sort(arr);
		System.out.println(total/5);
		System.out.println(arr[2]);

		sc.close();
	}	
}