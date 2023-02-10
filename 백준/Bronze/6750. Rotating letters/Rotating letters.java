import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] arr= str.split("");
		
		int cnt = 0;
		
		for(int i = 0; i<arr.length;i++) {
			
		   if(arr[i].equals("I")||arr[i].equals("O")||
				   arr[i].equals("S")||arr[i].equals("H")||
				   arr[i].equals("Z")||arr[i].equals("X")||
				   arr[i].equals("N")) {
			   
		   }
		   else {
			   cnt++;
		   }
		}
		if(cnt>0) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
		
		sc.close();
	
		
		
		
	}
}