import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
    	Scanner sc = new Scanner(System.in);
    	
    	String[] arr = new String [4];
    	
    	arr[0] = "s";
    	
    	arr[3] = "b";
    	
    	String str = sc.next();
    	
    	String[] s = str.split(""); 
    	
    	for(int i = 0 ; i<s.length;i++) {
    		if(s[i].equals("A")) {
    			String temp = arr[0];
    			arr[0] = arr[1];
    			arr[1] = temp;
    		}
    		if(s[i].equals("B")) {
    			String  temp = arr[0];
    			arr[0] = arr[2];
    			arr[2] = temp;
    		}
    		if(s[i].equals("C")) {
    			String  temp = arr[0];
    			arr[0] = arr[3];
    			arr[3] = temp;
    		}
    		if(s[i].equals("D")) {
    			String  temp = arr[1];
    			arr[1] = arr[2];
    			arr[2] = temp;
    		}
    		if(s[i].equals("E")) {
    			String  temp = arr[1];
    			arr[1] = arr[3];
    			arr[3] = temp;
    		}
    		if(s[i].equals("F")) {
    			String  temp = arr[2];
    			arr[2] = arr[3];
    			arr[3] = temp;
    		}
	
	
    	}
    	
    	System.out.println(Arrays.asList(arr).indexOf("s")+1);//자바 배열에서는 indexOf()를 지원하지 않고 ArrayList자료구조에서만 지원하므로 asList()를 통해 변환시켜 인덱스를 구해야 한다.
    	System.out.println(Arrays.asList(arr).indexOf("b")+1);

    	 
    
    }
}