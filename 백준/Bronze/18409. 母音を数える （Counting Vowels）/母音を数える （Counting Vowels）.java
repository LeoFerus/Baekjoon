import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String array [] = new String[n];
		
		String s = sc.next();
		
		array = s.split("");

		int t = 0;

		for(int i = 0; i<n; i++) {
			
			if(array[i].contains("a")||array[i].contains("i")||array[i].contains("u")||array[i].contains("e")||array[i].contains("o")) {
			 t++;
			}
			
		}
		System.out.println(t);
		
		sc.close();

	}

}
