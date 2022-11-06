import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		int a= 0;
		
		int b = 0;
		
		int c = 0;
		
	    while(true ) {
	    	a = sc.nextInt();
	    	
	    	b = sc.nextInt();
	    	
	    	c = sc.nextInt();
	    	
	    	if(a==0&&b==0&&c==0) {
	    		break;
	    	}
	    	
	    	if((a*a+b*b==c*c)|( b*b+c*c == a*a)| (a*a+c*c == b*b)){
	    		System.out.println("right");
	    	}
	    	else {
	    		System.out.println("wrong");
	    	}
	    	
	    
	    }
		
		sc.close();
	}	
}