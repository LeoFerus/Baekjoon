import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	     int t = sc.nextInt();
	     
	     for(int i = 0; i < t ; i++) {
	    	 
	    	 String name = sc.next();
	    	 int degree = sc.nextInt();
	    	 
	    	 String grade = "";
	    	 
	    	 if( 97<=degree && degree <=100) {
	    		 grade = "A+";
	    	 }
	    	 else if( 90<=degree && degree<=96) {
	    		 grade = "A";
	    	 }
	    	 else if(87<=degree && degree<=89) {
	    		 grade = "B+";
	    	 }
	    	 else if(80<=degree && degree<=86) {
	    		 grade = "B";
	    	 }
	    	 else if(77<=degree && degree<=79) {
	    		 grade = "C+";
	    	 }
	    	 else if(70<=degree && degree<=76) {
	    		 grade = "C";
	    	 }
	    	 else if(67<=degree && degree<=69) {
	    		 grade = "D+";
	    	 }
	    	 else if(60<=degree && degree<=66) {
	    		 grade = "D";
	    	 }
	    	 else {
	    		 grade = "F";
	    	 }
	    	 
	    	 System.out.println(name+" "+grade);
	    		 
	     }

           
	}
}