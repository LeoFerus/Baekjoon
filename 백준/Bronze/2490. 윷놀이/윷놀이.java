import java.util.*;

public class Main{

   public static void main(String[] args){
	   
	   Scanner sc = new Scanner(System.in);
	
	   int []array = new int [4];
	   
	   int sum = 0 ;
	   for(int j = 0; j<3; j++) {
	   for(int i = 0; i< 4; i++) {
		   sum = sc.nextInt() + sum;
	   }
	   
	   if(sum==4) {
		   System.out.println("E");
	   }
	   else if (sum ==3) {
		   System.out.println("A");
	   }
	   else if (sum ==2) {
		   System.out.println("B");
	   }
	   else if (sum == 1) {
		   System.out.println("C");
	   }
	   else {
		   System.out.println("D");
	   }
	   sum = 0;
	   }
	   sc.close();
   }
}