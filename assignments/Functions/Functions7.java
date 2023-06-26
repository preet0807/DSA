//Write a function that returns all prime numbers between two given numbers.
package Functions;

import java.util.Scanner;
import java.util.ArrayList;

public class Functions7 {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int start= sc.nextInt();
        int end= sc.nextInt();
        

        
        sc.close();
        ArrayList<Integer> numb= new ArrayList<>();
        for (int i=start;i<=end;i++)
 {
if (Primenumber(i)==true){
    numb.add(i);

}

 }  
 for( int a:numb){
    System.out.println(a);

 } 

     }

static boolean Primenumber(int i){
  
int count=0;
        for(int j=2;j<=i;j++){
            if(i%j==0){
                count+=1;
            }


        }
       return count<=1;
    }
   
 
}

