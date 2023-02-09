import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arrX = new int[n];
		
		int[] arrY = new int[n];
		
		for(int i = 0; i<n; i++) {
			arrX[i] = sc.nextInt();
			arrY[i] = sc.nextInt();
		}
		
		Arrays.sort(arrX);
		Arrays.sort(arrY);
		

	     System.out.println((arrX[arrX.length-1]-arrX[0])*(arrY[arrY.length-1]-arrY[0]));
		
		sc.close();
	
		
		
		
	}
}