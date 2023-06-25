//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

package Conditional;
import java.util.*;
import java.util.ArrayList;


public class Loops5 {
 

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sumofnegative=0;
        int sumofodd=0;
        int sumofeven=0;
        sc.close();
        ArrayList<Integer> list= new ArrayList<>();
        while(true){
            int n=sc.nextInt();
            list.add(n);

            if(n==0){
                break;

            }
        }

        for (int i:list){
            if(i<0){
                sumofnegative +=i;
            }
            if ((i%2==0)&& (i>0)){
                sumofeven+=i;


            }
            if ((i%2!=0)&& (i>0)){
                sumofodd+=i;

            }

}
System.out.println("sum of negative:: " +sumofnegative);
System.out.println("sum of postive even:: " +sumofeven);
System.out.println("sum of positive odd:: " +sumofodd);
    }
    
}
