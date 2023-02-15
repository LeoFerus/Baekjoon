import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String[] str = s.split("");
		
		int cnt =0;

		for(int i = 0 ; i<str.length-1;i++) {
			if(str[i].equals("s")&&str[i+1].equals("s")) {
				cnt++;
			}
		}
		
		if(cnt>0) {
			System.out.println("hiss");
		}
		else {
			System.out.println("no hiss");
		}
 		sc.close();
	
		
		
		
	}
}