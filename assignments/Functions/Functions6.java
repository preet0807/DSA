//Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
// 4! = 1 * 2 * 3 * 4 = 24 
// 3! = 3 * 2 * 1 = 6 
// 2! = 2 * 1 = 2 
// Also, 
// 1! = 1 
// 0! = 1

package Functions;

import java.util.Scanner;

public class Functions6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(Factorial(a));
        sc.close();

    }
    static int Factorial(int a){
        int n=1;
       for (int i=a;i>=1;i--){
        n=n*i;
       }
       return n;
       

    }
}
