import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		String[] adj = new String [n];
		
		String [] noun = new String[m];
		
		for(int i = 0; i < n; i++) {
			adj[i] = sc.next();
			
		}
		
		for(int j = 0; j < m; j++) {
		 	noun[j] = sc.next();
	
		}
		

		
		for(int i = 0 ;i<n; i++) {
			
			for(int j = 0; j<m; j++) {
				System.out.println(adj[i]+" as "+noun[j]);
			}
		}
		
		sc.close();
	
		
		
		
	}
}