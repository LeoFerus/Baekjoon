import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		
		String str = sc.nextLine();
		
		String[] arr = str.split(" ");
		
		int change = 5000;
		
		for(int i = 0; i<arr.length; i++) {
			
		 if(arr[i].equals("1")) {
			 change = change - 500;
		 }
		 if(arr[i].equals("2")) {
			 change = change -800;
		 }
		 if(arr[i].equals("3")) {
			 change = change - 1000;
		 }
		}
		
		System.out.println(change);
		
		
		sc.close();
		

		
	}

}	