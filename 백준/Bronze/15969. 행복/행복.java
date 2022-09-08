import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        int[] arr = new int[t];
        
        for(int i = 0; i<t; i++) {
        	arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.println(arr[arr.length-1]-arr[0]);
        sc.close();
    }
}