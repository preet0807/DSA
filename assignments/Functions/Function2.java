//Define a program to find out whether a given number is even or odd.
package Functions;

import java.util.Scanner;

public class Function2 {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        sc.close();
        System.out.println(evenodd(a));

    
}
static String evenodd(int a){
    // return a%2==0;
    if(a%2==0){
        return "even";
    }
    else{
        return "odd";
    }
    
}



}
