import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String [] w = sc.next().split("");
      
      for(int i = 0; i<w.length; i++) {
         if(!w[i].equals("C")&&!w[i].equals("A")&&!w[i].equals("M")&&!w[i].equals("B")&&!w[i].equals("R")&&!w[i].equals("I")&&!w[i].equals("D")&!w[i].equals("G")&&!w[i].equals("E")) {
            System.out.print(w[i]);
         }
      }
      sc.close();
   }
 
}