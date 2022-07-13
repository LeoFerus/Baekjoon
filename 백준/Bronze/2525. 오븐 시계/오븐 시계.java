import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(); // A
		
		int m = sc.nextInt(); //B
		
	    int cm = sc.nextInt(); //C
	    
	    m=m+cm;
	   
	    while(true) {
	    if(m>=60) {
	    	m=m-60;
	    	h=h+1;
	    }
	    else {
	    	break;
	    }
	    }
	    
	    if(h>=24) {
	    	h = h-24;
	    }
	    
	    System.out.println(h +" "+m);
		
		sc.close();
	}
}