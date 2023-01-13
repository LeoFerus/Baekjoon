import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String str = sc.next();
		
		String[] arr = str.split("");
		
		for(int i = 0 ; i<arr.length; i = i+n) {
			System.out.print(arr[i]);
		}
	
	
	}
}