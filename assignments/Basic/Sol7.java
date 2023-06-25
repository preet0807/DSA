package Basic;
import java.util.Scanner;

public class Sol7 {
            public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        sc.close();
       
        for (int i=a;i<=b;i++){
             int sum=0;
        int j=i;
            while(j!=0){
                 
                int n=j%10;
                sum=sum+(n*n*n);
                j=j/10;
                

            }
            if (sum==i){
                System.out.println(i);

            }
}sc.close();
        }

    
}

