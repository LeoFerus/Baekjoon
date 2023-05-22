import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		
		
	    Scanner sc = new Scanner(System.in);   
		
	    String [] c = sc.nextLine().split("");
	    
	    int cntM = 0;
	    
	    int cntO = 0;
	    
	    int cntB = 0;
	    
	    int cntI = 0;
	    
	    int cntS = 0;
	    
	    for(int i = 0 ;i<c.length;i++) {
	    	if(c[i].equals("M")) {
	    		cntM++;
	    	}
	    	if(c[i].equals("O")) {
	    		cntO++;
	    	}
	    	if(c[i].equals("B")) {
	    		cntB++;
	    	}
	    	if(c[i].equals("I")) {
	    		cntI++;
	    	}
	    	if(c[i].equals("S")) {
	    		cntS++;
	    	}
	    }
	    
	    if(cntM>0&&cntO>0&&cntB>0&&cntI>0&&cntS>0) {
	    	System.out.println("YES");
	    }
	    else {
	    	System.out.println("NO");
	    }
	 

	    
	    
	}
	
}