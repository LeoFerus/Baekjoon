import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t =sc.nextInt();
		
		
		
		for(int i = 0; i<t; i++) {
			int total = 0;
			int n = sc.nextInt();
			
			int[]arr = new int[n+1];
			
			for(int j = 1; j<n+1; j++) {
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			for(int k = 1; k<n+1;k++) {
				total = total+Math.abs(arr[k]-arr[k-1]);
			}
			total = total+Math.abs(arr[arr.length-1]-arr[1])-arr[1];
			System.out.println(total);
		}

		

	}

}