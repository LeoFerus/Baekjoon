import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int m = 1;

int f = 1;


while(true){

m = sc.nextInt();

f = sc.nextInt();
if(m==0&f==0) {
break;
}
System.out.println(m+f);
}



sc.close();
}
}