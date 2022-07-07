import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String [] darius = sc.next().split("/");
		
        int k = Integer.parseInt(darius[0]);
        
        int d = Integer.parseInt(darius[1]);
        
        int a = Integer.parseInt(darius[2]);
        
        if(k+a<d || d==0) {
        	System.out.println("hasu");
        }
        
        else {
        	System.out.println("gosu");
        }
		
		sc.close();
	}

}