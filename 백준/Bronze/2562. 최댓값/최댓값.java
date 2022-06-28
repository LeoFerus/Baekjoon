import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int []array = new int [9];
		
		Integer []array2 = new Integer [9];
		
		for(int i = 0; i<9; i++) {
		
			array[i] = sc.nextInt();
			array2[i] = array[i];
			
		}
		
		Arrays.sort(array2,Collections.reverseOrder());
		
		int max = array2[0];
		
		System.out.println(max);
		
		for(int i = 0; i<9; i++) {
			if(array[i]==max) {
				System.out.println(i+1);
			}
		}
		
		
		sc.close();

	}

}