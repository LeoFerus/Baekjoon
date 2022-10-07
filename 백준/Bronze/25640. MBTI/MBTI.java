import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String jinho = sc.next();
		
		int n = sc.nextInt();
		
		String friend ;
		
		int count = 0;
		
		for(int i = 0; i< n ; i++) {
			friend = sc.next();
			if(jinho.equals(friend)){
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}