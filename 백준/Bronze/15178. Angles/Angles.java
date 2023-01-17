import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	  int t = sc.nextInt();
	  
	  int a,b,c =0;
	  
	  for(int i  = 0; i<t;i++) {
		  a = sc.nextInt();
		  b = sc.nextInt();
		  c = sc.nextInt();
		  
		  if(a+b+c==180) {
			  System.out.println(a+" "+b+" "+c+" "+"Seems OK");
		  }
		  else{
			  System.out.println(a+" "+b+" "+c+" "+"Check");
		  }
	  }
	}
}