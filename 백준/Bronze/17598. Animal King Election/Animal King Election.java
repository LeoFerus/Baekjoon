import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Tg = "Tiger";
		
		String Li = "Lion";
		
		int Tcnt = 0;
		
		int Lcnt = 0;
		
		String temp = "";
		
		for(int i = 0 ;i < 9 ; i++) {
			
			temp = sc.next();
			
			if(temp.equals(Tg)) {
				Tcnt++;
			}
			else {
				Lcnt++;
			}
		}
		
		if(Tcnt>Lcnt) {
			System.out.println(Tg);
		}
		else {
			System.out.println(Li);
		}
		
		
		
		
		
	}
}