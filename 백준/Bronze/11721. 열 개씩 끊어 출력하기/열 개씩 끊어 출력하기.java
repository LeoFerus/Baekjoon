import java.util.*;

public class Main{

   public static void main(String[] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   String s = sc.next();
	   
	   String [] str = s.split("");
	   
	
	   
	   for(int i = 0; i<str.length;i++) {
		   
	
		   System.out.print(str[i]);
	   
	   if(i%10==9) { //10의 배수가 될때 마다 행을 바꾼다. 
		   System.out.println();
	   }
	   }
	   sc.close();
   }
 
}