import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n   =sc.nextInt();
		
		int w = sc.nextInt();
		
		int h = sc.nextInt();
		
		double hypo = Math.sqrt((Math.pow(w, 2)+Math.pow(h, 2)));
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
			if( arr[i]<=w||arr[i]<=h||arr[i]<=hypo){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
		
	}
}