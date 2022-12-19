import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    String in = sc.next();
    
    int count1 = 0;
    
    int count2 = 0;
    
    for(int i =0; i<in.length()-1;i++) {
    	switch(in.charAt(i)) {
    	case'J':
    		if(in.charAt(i+1)=='O'&&in.charAt(i+2)=='I') {
    			count1++;
    			break;
    		}
    	case'I':
    		if(in.charAt(i+1)=='O'&&in.charAt(i+2)=='I') {
    			count2++;
    		}
    	}
    }
    
    System.out.println(count1);
    System.out.println(count2);
	}
}