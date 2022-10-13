import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int p = sc.nextInt();
		
		int h = sc.nextInt();
		
		int news = 0;
		
		for(int i = 0; i<n; i++) {
			news = sc.nextInt();
			
			if(news<p) {
				System.out.println("NTV: Dollar dropped by "+Math.abs(news-p)+" Oshloobs");
		
			}
			if(news>h){
				System.out.println("BBTV: Dollar reached "+news+" Oshloobs, A record!");
				h = news;
			}
			p = news;
		}
		
		sc.close();
		
	}

}	