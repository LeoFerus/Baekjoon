import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
    	Scanner sc = new Scanner(System.in);
    	
    	
    	String x = sc.next();
    	
    	String n = "";
    	
    	int n8 = 0;
    	
    	int n16 = 0;
    	
    	if(x.charAt(0) == '0') {
    			if(x.charAt(1)=='x') {
    			for(int i = 2; i < x.length();i++) {
    				n = n+x.charAt(i);}
    				n16 = Integer.valueOf(n,16);
    				}
    			
    			else {
    				for(int i = 1; i<x.length();i++) {
    				n = n+x.charAt(i);
    					}
    				n8 = Integer.valueOf(n,8);
    				}
    			}
    	else { 
    		System.out.println(x);
    	}
    	
    	if(n8!=0||n16!=0) {
    		System.out.println(n8>n16?n8:n16);
    	}
     
    
    }
}