import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String mbti = sc.next();
		
		char[] c = new char[4];
	
		for(int i = 0; i<4; i++) {
				
		  c[i] = mbti.charAt(i);
		}	
		
		String[] her = new String[4];
		
		if(c[0]=='E') {
			her[0] = "I";
		}
		else {
			her[0] = "E";
		}
		
		if(c[1] =='S') {
			her[1] ="N";
		}
		else {
			her[1] = "S";
		}
		
		if(c[2]=='T') {
			her[2] = "F";
		}
		else {
			her[2] = "T";
		}
		
		if(c[3]=='J') {
			her[3] ="P";
		}
		else {
			her[3] ="J";
		}
		
		for(int i = 0; i<4; i++) {
			System.out.print(her[i]);
		}
		
		sc.close();
		
	}

}