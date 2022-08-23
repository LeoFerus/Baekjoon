import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        int n = sc.nextInt();
        
        int m = sc.nextInt();
        
        int[] arr = new int [n+1];
        
        for(int i = 1; i<n+1;i++) {
        	arr[i] = i;
        }
        int temp = 0;
        int temp1 = 0;
        int temp2 = 0;
        for(int i = 1; i<m+1; i++) {
        	temp1 = sc.nextInt();
        	temp2 = sc.nextInt();
        	temp =arr[temp1];
        	arr[temp1] = arr[temp2];
        	arr[temp2] = temp;
        			
        }
        for(int i = 1; i<n+1;i++) {
        	System.out.print(arr[i]+" ");
        }
        
 
        
   

        sc.close();
    }
}