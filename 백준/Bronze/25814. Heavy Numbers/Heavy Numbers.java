import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		String a =sc.next();
		
		String b = sc.next();
		
		String[] arr1 = a.split("");
		
		String[] arr2 = b.split("");
				
		int t1 =0;
				
		int t2 = 0;
		
		for(int i = 0; i<a.length();i++) {
		t1=Integer.parseInt(arr1[i])+t1;
		}
		
		t1 = t1*a.length();
		
		for(int i = 0; i<b.length(); i++) {
			t2 = Integer.parseInt(arr2[i])+t2;
		}
		t2 = t2*b.length();
		
		if(t1>t2) {
			System.out.println(1);
		}
		else if(t1==t2) {
			System.out.println(0);
		}
		else {
			System.out.println(2);
		}
		
		sc.close();
		

		
	}

}	