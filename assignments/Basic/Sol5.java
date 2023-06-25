package Basic;
import java.util.Scanner;

public class Sol5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count= sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        sc.close();


        
        for(int i=2;i<count;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;


        }    
}
}