import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] arr = str.toCharArray();
		
	     boolean[] check2 = new boolean [26];
		
	     int alphabet[] = new int[27];
	    
		for(int i = 0 ;i<25; i++) {
			
			char ch = str.charAt(i);
			alphabet[ch-'A']++;
			}
			
		 
        for(int i = 0; i <26; i++) {
        	if(alphabet[i]==0) {
        		System.out.println((char)(i+65));
        	}
        	
           
        }
	}
}