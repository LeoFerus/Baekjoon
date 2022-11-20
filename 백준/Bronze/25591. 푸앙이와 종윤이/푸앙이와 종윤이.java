import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int a = 100-sc.nextInt();
    int b = 100-sc.nextInt();
    
    int c = 100-(a+b);
    
    int d = a*b;    

    int q=	d/100;
    int r = d%100;
    System.out.print(a+" "+b+" "+c+" "+d+" "+q+" "+r+"\n");


    System.out.print(c+q + " " +r);
	}
}