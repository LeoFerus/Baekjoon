import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		String b = sc.next();
		
		String c = sc.next();
		
		String d = sc.next();
		
		String d1 = a+b;
		
		String d2 = c+d;
		
		System.out.println(Long.parseLong(d1)+Long.parseLong(d2));
		sc.close();
		

		
	}

}	