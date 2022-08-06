import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); 
        
        
        for(int i = 0; i<t; i++) {
        	String str = sc.next();
        	 char [] array = str.toCharArray();

        if(array[array.length/2-1]==array[array.length/2]) {
        	System.out.println("Do-it");
        }
        else {
        	System.out.println("Do-it-Not");
        }
        }
  
        sc.close();
    }
}