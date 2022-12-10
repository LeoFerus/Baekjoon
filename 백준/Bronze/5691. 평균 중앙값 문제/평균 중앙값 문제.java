import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int a = 0;
    int b = 0;
    int temp = 0;
    int c = 0;
 while(true) {
	 a = sc.nextInt();
	 b = sc.nextInt();
	 if(a==0&&b==0) {
		 sc.close();
		 break;
	 }
	 temp = b-a;
	 
	 c = a -temp;
	 System.out.println(c);
	 
 }
	}
}