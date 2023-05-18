import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		
	    Scanner sc = new Scanner(System.in);   
		
	    int n = sc.nextInt();
	    
	    char[] arr = sc.next().toCharArray();
	    
	    int sCnt = 0;
	    
	    int bCnt = 0;
	    for(int i = 0; i<arr.length;i++) {
	    	if(arr[i]== 's') {
	    		sCnt++;
	    	}
	    	if(arr[i] == 'b') {
	    		bCnt++;
	    	}
	    }
	    
	    if(sCnt>bCnt) {
	    	System.out.println("security!");
	    }
	    if(sCnt<bCnt) {
	    	System.out.println("bigdata?");
	    }
	    if(sCnt==bCnt){
	    	System.out.println("bigdata? security!");
	    }

	}
	
}