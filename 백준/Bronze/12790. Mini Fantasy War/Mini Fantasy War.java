import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int t =sc.nextInt();
		
		for(int i = 0; i<t; i++) {
			int hp = sc.nextInt();
			
			int mp = sc.nextInt();
			
			int kou = sc.nextInt();
			
			int bou = sc.nextInt();
			
			hp = hp+sc.nextInt();
			
			mp = mp + sc.nextInt();
			
			kou = kou+ sc.nextInt();
			
			bou = bou + sc.nextInt();
			
			if(hp<1) {
				hp = 1;
			}
			if(mp<1) {
				mp = 1;
			}
			if(kou<0) {
				kou = 0;
			}
			
			int sentou = hp+5*mp+2*kou+2*bou;
			
			System.out.println(sentou);
		}
		
		
		sc.close();
	
		
		
		
	}
}