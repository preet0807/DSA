// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

package Functions;
import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("the max value is :: "+max(a,b,c));
        System.out.println("the min value is :: "+min(a,b,c));
        sc.close();
    }
    static int max(int a , int b, int c){
        int max= Integer.MIN_VALUE;
    

       if (a>max){
        max=a;

       }
       if(b>max){
        max=b;
       }
       if (c>max){
        max=c;
       }



        return max;

    }
    static int min(int a , int b, int c){
        
       int  min= Integer.MAX_VALUE;
        
        if (a<min){
        min=a;

       }
       if(b<min){
        min=b;
       }
       if (c<min){
        min=c;
       }
       return min;

    }
    
}
