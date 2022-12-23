import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    double bl  = 350.34;
    
    double vs = 230.90;
    
    double hs = 190.55;
    
    double arm = 125.30;
    
    double leg = 180.90;
    
    int t = sc.nextInt();
    
    double a,b,c,d,e=0;
    
    for(int i = 0; i<t; i++) {
    	
    	a = sc.nextDouble();
    	
    	b = sc.nextDouble();
    	
    	c = sc.nextDouble();
    	
    	d = sc.nextDouble();
    	
    	e = sc.nextDouble();
    	
    	System.out.printf("$%.2f\n",a*bl+vs*b+hs*c+arm*d+leg*e);
    	
    }
    		

    
	}
}