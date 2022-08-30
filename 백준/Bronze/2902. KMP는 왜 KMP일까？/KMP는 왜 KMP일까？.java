import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        char[] arr = s.toCharArray();
        
        String text = "";
        
        text += Character.toString(arr[0]);
        for(int i =1; i<arr.length;i++) {
        	if(arr[i]==45) {
        	text+= Character.toString(arr[i+1]);
        	}
        }
        System.out.println(text);
        
        sc.close();
    }
}