import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		 
		int [] a = new int [10];
		
		int [] b = new int[10];
		
		for(int i = 0 ; i<10;i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i<10;i++) {
			b[i] = sc.nextInt();
		}
		
		int A = 0 ;
		
		int B = 0 ;
		
		for(int i = 0; i<10; i++) {
			if(a[i]>b[i]) {
				A++;
			}
			else if(a[i]<b[i]) {
				B++;
			}
		
			
		}
		if(A<B) {
			System.out.println("B");
		}
		else if (A==B) {
			System.out.println("D");
		}
		else {
			System.out.println("A");
		}
	}
}