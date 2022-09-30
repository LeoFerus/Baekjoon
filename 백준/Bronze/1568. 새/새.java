
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 0;
		int i =0;
		while(true) {

			if(n<i) {
				i = 1;
			}
			n = n - i;
			i++;
			
			if (n <=0){
				System.out.println(count);
				break;
			}
			count++;
		}
	
		
	    sc.close();
	
	}

}