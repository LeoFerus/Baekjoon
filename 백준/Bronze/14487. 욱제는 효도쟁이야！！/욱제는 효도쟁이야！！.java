import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int [n];
        int t = 0;
        
        for(int i = 0; i<n; i++) {
        	arr[i] = sc.nextInt();
        	t = t+arr[i];
        }
        
        Arrays.sort(arr);
        
        System.out.println(t-arr[n-1]);
        sc.close();
    }
}