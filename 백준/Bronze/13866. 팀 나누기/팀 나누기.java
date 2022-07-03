import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long []array = new long[4];
		
		for(int i=0; i<4; i++) {
			array[i] = sc.nextInt();
		}
	

		Arrays.sort(array);

		
		System.out.println(Math.abs((array[3]+array[0])-(array[2]+array[1])));
		
		
		sc.close();
	}

}
