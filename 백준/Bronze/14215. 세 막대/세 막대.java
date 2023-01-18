import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int[] arr = new int [3];
		
		for(int i = 0; i<3; i++) {
		 arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		if(arr[0]+arr[1]>arr[2]) {
			System.out.println(arr[0]+arr[1]+arr[2]);
		}
		else if(arr[0]==arr[2]&&arr[1]==arr[2]) {
			System.out.println(arr[0]*2);
		}
		else {
			System.out.println(arr[0]+arr[1]+(arr[0]+arr[1]-1));
			
		}
		
		sc.close();
		
		
	}
}