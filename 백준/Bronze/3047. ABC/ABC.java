import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		
		
		for(int i = 0; i<3; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		String alphabet  = sc.next();
		
		String[] str = alphabet.split("");
		
		for(int i = 0; i<3; i++) {
			
			if(str[i].equals("A")) {
				System.out.print(arr[0]+" ");
			}
			else if(str[i].equals("B")) {
				System.out.print(arr[1]+" ");
			}
			else{
				System.out.print(arr[2]+" ");
			}
		}
		sc.close();
}	
}