import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int B = sc.nextInt();
		int[] bArr = new int[B];
		int[] aArr = new int[B];
		
		for(int i=0; i<bArr.length; i++) {
			bArr[i] = sc.nextInt();
		}
		
		int sum = 0;	
		
		for(int i=0; i<bArr.length; i++) {
			aArr[i] = bArr[i] * (i+1) - sum; 
			sum += aArr[i];
		}
		
		for(int i=0; i<aArr.length; i++) {
			System.out.print(aArr[i] + " ");
		}
		
	}
}