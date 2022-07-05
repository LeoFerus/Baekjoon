import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long []array = new long[4];
		
		long []array2 = new long[2];
		
		for(int i=0; i<4; i++) {
			array[i] = sc.nextInt();
		}
		for(int i=0; i<2; i++) {
			array2[i] = sc.nextInt();
		}
	

		Arrays.sort(array);
		Arrays.sort(array2);

		
		System.out.println(array[3]+array[2]+array[1]+array2[1]);
		
		
		sc.close();
	}

}