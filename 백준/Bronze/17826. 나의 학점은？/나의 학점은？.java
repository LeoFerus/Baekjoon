import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int []array = new int [50];
		
		for(int i = 0; i<50; i++) {
			array[i] = sc.nextInt();
		}
		
		int h = sc.nextInt();
		
		int q = 0;
		
		for(int i = 0 ; i<50; i++) {
			if(array[i]==h){
				q = i+1;
			}
		}
		
		if(0<q && q<=5) {
			System.out.println("A+");
		}
		else if (6<=q && q<=15) {
			System.out.println("A0");
		}
		else if (16<=q && q<=30) {
			System.out.println("B+");
		}
		else if (31<=q && q<=35) {
			System.out.println("B0");
		}
		else if (36<=q && q<=45) {
			System.out.println("C+");
		}
		else if (46<=q && q<=48) {
			System.out.println("C0");
		}
		else {
			System.out.println("F");
		}
		
		sc.close();
	}
 
}
