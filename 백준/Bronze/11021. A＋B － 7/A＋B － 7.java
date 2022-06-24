import java.util.*; 

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	    int x = scan.nextInt();
	    
	    int array[] = new int [x];
	    
	    for(int i=0;i<x;i++) {
	    	int a = scan.nextInt();
	    	int b = scan.nextInt();
	    	array[i] = a+b;
	    }
	    
	    for(int k = 0; k<array.length; k++) {
	    	System.out.printf("Case #%d: %d %n",k+1 ,array[k]);
	    }

		scan.close();
	}

}