import java.util.*;

public class Main{

   public static void main(String[] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n = sc.nextInt();
	   
	   int sum = 1;
	
	   for(int i = 0; i<n; i++) {
		   sum = (i*sum)+sum;
	   }
	   System.out.println(sum);
	   sc.close();
   }
}