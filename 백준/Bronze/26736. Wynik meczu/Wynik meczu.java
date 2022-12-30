import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int Acnt = 0;
		
		int Bcnt = 0;
		
		String[]arr  = str.split("");
		
		for(int i = 0; i<arr.length;i++) {
			
			if(arr[i].equals("A")){
				Acnt++;
			}
			else {
				Bcnt++;
			}
					
		}
		
		System.out.println(Acnt+" : "+Bcnt);
		
	}
}