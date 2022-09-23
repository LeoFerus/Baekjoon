import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 1000 - sc.nextInt();
        
        int count = 0;
      
        
        if(500<=n) {

        int fH = n/500;
        
        count = fH;
        
        n = n- fH*500;
        }
        else {
        count = 0;
        }
        
        
        if(100<=n) {

        int h = n/100;
        
        count = h+count;
        
        n = n- h*100;
        }
        else {
        count = 0+count;
        }
        if(50<=n) {

        int fT = n/50;
        
        count = fT+count;
        
        n = n- fT*50;
        }
        else {
        count = 0+count;
        }
        if(10<=n) {

        int t = n/10;
        
        count = t+count;
        
        n = n- t*10;
        }
        else {
        count = 0+count;
        }
        
        if(5<=n) {

        int f = n/5;
        
        count = f+count;
        
        n = n- f*5;
        }
        else {
        count = 0+count;
        }
        
        if(1<=n) {

        int one = n/1;
        
        count = one+count;
        
        n = n- one*5;
        }
        else {
        count = 0+count;
        }
        
        
        System.out.println(count);
       
        
        
        

        sc.close();
    }
}