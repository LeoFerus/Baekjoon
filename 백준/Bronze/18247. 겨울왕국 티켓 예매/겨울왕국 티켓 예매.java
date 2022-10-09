
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int[] array = new int [t];
		
		int n = 0;
		
		int m = 0;
		
		for(int i = 0; i<t;i++) {
		
			n = sc.nextInt();
			m = sc.nextInt();
		
		if(n<12||m<4) {
			array[i] = -1;
		}
		else {
			array[i]=m*11+4;
		}
		}
		for(int i = 0; i<t; i++) {
			System.out.println(array[i]);
		}
		
		sc.close();
	}

}	