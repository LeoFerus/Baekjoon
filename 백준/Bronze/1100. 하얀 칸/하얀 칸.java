import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		for(int i = 0; i<8; i++) {
		
			String chBoard = sc.next();
			for(int j = 0; j<8;j++) {
				if((i+j)%2 ==0&& chBoard.charAt(j)=='F') {
					count++;
				}
			}
		}
		
		System.out.println(count);
		sc.close();
		

		
	}

}	