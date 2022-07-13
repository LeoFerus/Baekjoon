import java.util.*;

public class Main{

   public static void main(String[] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int[] array = new int [7];
	   
	   int sum = 0;
	   
	   int x = 0;
	   
	   for(int i = 0; i<7;i++) {
		   x = sc.nextInt();
		   if(x%2!=0) {			//홀수 일경우 총합에 더한다.
			   sum = sum+x;
			   array[i] = x;	// 홀수 일경우 배열에 저장한다. 
		   }
		   
	   }
	   if(sum>0) {
		   System.out.println(sum);
		   Arrays.sort(array);
		   for(int i = 0; i<7;i++) {
		    if(array[i]!=0) {		//정렬된 배열중에 값이 0이 아닌 것(홀수가 저장되어있는 배열)을 찾으면 지점을 출력하고 break로 빠져나온다. 
		    	  System.out.println(array[i]);
		    	  break;
		   }
		   }
		 
	   }
	   else {
		   System.out.println(-1);
	   }
	   sc.close();
   }
 
}