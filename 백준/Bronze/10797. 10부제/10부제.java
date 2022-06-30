import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int []array = new int[5];
		
		for(int i =0; i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		
		int t = 0;
		
		for(int i =0; i<array.length; i++) {
			if(x==array[i]) {
				t++;
			}
		}
		System.out.println(t);
		
		
		sc.close();
	}

}