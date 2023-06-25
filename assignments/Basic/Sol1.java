package Basic;
import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        // int b =sc.nextInt();
        for (int i=1;i<=10;i++){
           int c=a*i;
           System.out.println(a+"*"+i+"="+c);
           
        }
        
        sc.close();

    

    }
}
