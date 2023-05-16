import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		
	    Scanner sc = new Scanner(System.in);   
		
	    int n = sc.nextInt();
	    
	    int[][] arr = new int [n][2];
	    
	    for(int i = 0 ;i<n;i++) {
	    	arr[i][0] = sc.nextInt();
	    	
	    	arr[i][1] = sc.nextInt();
	    }
	    
	    Arrays.sort(arr,(x,y) ->{
	    	if(x[0] == y[0]) {
	    		return x[1] - y[1];
	    	}
	    	else {
	    		return x[0] - y[0];
	    	}
	    });
	    
	    for(int i = 0 ;i < n; i++) {
	    	System.out.println(arr[i][0]+ " "+ arr[i][1]);
	    }
	}
	
}