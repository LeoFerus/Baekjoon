import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String w = sc.next();
		
		for(int i = 0; i<w.length(); i++) {
			if(w.charAt(i)!='C'&&w.charAt(i)!='A'&&w.charAt(i)!='M'&&w.charAt(i)!='B'&&w.charAt(i)!='R'&&w.charAt(i)!='I'&&w.charAt(i)!='D'&&w.charAt(i)!='G'&&w.charAt(i)!='E') {
				System.out.print(w.charAt(i));
			}
		}
		sc.close();
	}
 
}