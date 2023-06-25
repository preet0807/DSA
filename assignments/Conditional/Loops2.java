package Conditional;
import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(subtractProductAndSum(n));
       
sc.close();


    
    }
   
    public static int subtractProductAndSum(int n) {
        
        int mul=1;
        int sum=0;
        
        while(n!=0){
           
            int b= n%10;
            mul=mul*b;
            sum=sum+b;
            n=n/10;
            
        }
        int res= mul-sum;
        return res;
        
        

        
    }
    
}
