import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String name = sc.next();
			int year = sc.nextInt();
			int weight = sc.nextInt();
			if(name.equals("#")) {
				break;
			}
			
			
			if(year>17||weight>=80) {
				System.out.println(name +" Senior");
			}
			else {
				System.out.println(name + " Junior");
			}
			
		}
		sc.close();
}	
}