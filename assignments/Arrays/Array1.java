package Arrays;
// https://leetcode.com/problems/build-array-from-permutation/

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] myarray= new int[n];
        
        
        for (int i=0;i<n;i++){
            
            myarray[i] = sc.nextInt();

        }
        System.out.println(myarray);

        

        

        
    }
    
}
