import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] wScore = new int[10];
        
        int [] kScore = new int[10];
        
        for(int i = 0; i<10;i++) {
        	wScore[i] = sc.nextInt();
        }
        
        for(int i = 0; i<10; i++) {
        	kScore[i] = sc.nextInt();
        }
        
        Arrays.sort(wScore);
        
        Arrays.sort(kScore);
        
        System.out.print(wScore[9]+wScore[8]+wScore[7]+" ");
        System.out.print(kScore[9]+kScore[8]+kScore[7]);
        
        sc.close();
    }
    	
}