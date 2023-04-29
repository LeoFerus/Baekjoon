import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		

		
	    int[] arr = new int [n];
	    
	    int sumY = 0;
	    
	    int sumM = 0;
	    
	    for(int i = 0; i<n; i++) {
	    	arr[i] = sc.nextInt();
	    	
	    	sumY = yeongsik(sumY,arr[i]);
	    	
	    	sumM = minsik(sumM,arr[i]);

	    }
	    if(sumY==sumM) {
	    	System.out.println("Y M "+sumY);
	    }
	    else if(sumY > sumM) {
	    	System.out.println(("M "+sumM));
	    	
	    }
	    else {
	    	System.out.println("Y "+sumY);
	    }
	}
	public static int yeongsik (int sum ,int x) {
		
		sum = sum+(x/30+1)*10;
		
		return sum;
	}
	public static int minsik(int sum ,int x) {
		
		sum = sum+(x/60+1)*15;
		
		return sum;
	}
	

}
