import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
    	Scanner sc = new Scanner(System.in);
    	
    	String n = sc.next();
    	
    	String n1 = n.substring(0,n.length()/2);
    	
    	String n2 = n.substring(n.length()/2,n.length());
    	
    	System.out.println(Integer.parseInt(n1)+" "+Integer.parseInt(n2));
    	
    	
    
    }
}