import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		while(sc.hasNextInt()){
		int num = sc.nextInt();
		if(num>0){ 
		 cnt++;
		}
		}
		System.out.println(cnt);
		sc.close();
	
	
	}
}