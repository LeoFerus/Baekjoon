
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     
     int t = sc.nextInt();
     
     for(int i = 0; i<t; i++) {
    	 String[] str = sc.next().split("");
    	 
    	 System.out.println(str[0]+""+str[str.length-1]);
    	 
     }
		
	}

}