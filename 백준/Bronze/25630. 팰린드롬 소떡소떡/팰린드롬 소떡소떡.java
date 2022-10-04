
import java.util.*;

public class Main {
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String st = sc.next();
		
		String [] array = st.split("");
		
		int count = 0;
		
			for(int i = 0 ;i<array.length/2; i++) {
				for(int j = n-1; j>=array.length/2; j--) {
					if(!array[i].equals(array[j])&&i+j==n-1) {
						count++;
					}
				}
			}
		System.out.println(count);
		sc.close();
	}

}