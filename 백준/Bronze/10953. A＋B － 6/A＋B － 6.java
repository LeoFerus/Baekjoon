import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int t = sc.nextInt();
    
    String[] str = new String[2];
    
    int total = 0;
    
    for(int i = 0; i<t; i++) {
    	str = sc.next().split(",");
    	
    	total = Integer.parseInt(str[0])+Integer.parseInt(str[1]);
    	
    	System.out.println(total);
    	
    	total = 0;
    }
    sc.close();
    
	}
}