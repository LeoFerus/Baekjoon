import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
    	Scanner sc = new Scanner(System.in);
    	
    	
    	int  c= sc.nextInt();

    	int  b= sc.nextInt();

    	int  p= sc.nextInt();

    	int  cR= sc.nextInt();

    	int  bR= sc.nextInt();

    	int  pR= sc.nextInt();

        int sumC = cR-c;
        
        int sumB = bR-b;
        
        int sumP = pR-p;
        
        if(sumC<0) {
        	sumC = 0;
        }
        if(sumB<0) {
        	sumB = 0;
        }
        
        if(sumP<0) {
        	sumP = 0;
        }
        
        System.out.println(sumC+sumB+sumP);

   
    }
}