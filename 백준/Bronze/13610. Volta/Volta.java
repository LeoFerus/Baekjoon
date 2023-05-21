import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		
		
	    Scanner sc = new Scanner(System.in);   
		
	    int a =sc.nextInt();
	    
	    int b =sc.nextInt();
	    
	    int lab =1;
	    
	    int cur =a;
	    
	    lab += (cur % (b-a) == 0) ? cur / (b-a) : cur / (b-a) + 1;
	    
	    System.out.println(lab);
	 

	    
	    
	}
	
}