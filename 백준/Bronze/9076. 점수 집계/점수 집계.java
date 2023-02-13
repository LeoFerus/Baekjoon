import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[5];
		
		
		
		for(int i = 0; i<n;i++) {
			int sum = 0;
			for(int j = 0; j<5;j++) {
				arr[j] = sc.nextInt();
				sum = arr[j]+sum;
			}
			Arrays.sort(arr);
			if(arr[arr.length-2]-arr[1]<4) {
				System.out.println(sum-(arr[arr.length-1]+arr[0]));
			}
			else {
				System.out.println("KIN");
			}
		}
		
		
		sc.close();
	
		
		
		
	}
}