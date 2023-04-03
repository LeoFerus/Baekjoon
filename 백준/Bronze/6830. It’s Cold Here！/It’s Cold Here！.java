import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
	
		
		String city = "";
		
		int celsius = 200;
		
		while(true) {
			
			String s = sc.next();
			
			int c = sc.nextInt();
			
			if(c<celsius){
				
				city = s;
				
				celsius =c;
			}
			
			if(s.equals("Waterloo")) {
				break;
			}
			
		}
		
		System.out.println(city);
	}
}
