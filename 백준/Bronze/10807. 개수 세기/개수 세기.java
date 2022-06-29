import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []array = new int [n];
		
		for(int i =0; i<n; i++) {
			int x = sc.nextInt();
			array[i] = x;
		}
		
		int v = sc.nextInt();
		
		int t = 0;
		
		for(int i =0; i<n; i++) {
			if(array[i]==v) {
				t++;
			}
		}
		System.out.println(t);

	}

}