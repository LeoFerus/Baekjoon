import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        String []arr = str.split(",");
        
        int[] num = Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
        
        int t = 0;
        
        for(int i =0; i<num.length; i++) {
        	t = num[i]+t;
        }
        System.out.println(t);
        sc.close();
    }
}