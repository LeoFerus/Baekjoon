import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int count = 0; 
		
		int total = 0;
		
		while(true) {
			if(Integer.parseInt(str)<10) {
				break;
			}
		String[] digit = str.split("");		
		
		total = Integer.parseInt(digit[0]);
		for(int i = 1; i<digit.length; i++) {
			total = total*Integer.parseInt(digit[i]);
		}
		
		count++;
			
			if(total<10) {
				break;
			}
			
			
			str = Integer.toString(total);
			total=0;
		}
		
		
		System.out.println(count);	
		
		sc.close();
}	
}