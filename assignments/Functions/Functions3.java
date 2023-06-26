package Functions;

import java.util.Scanner;

public class Functions3 {
    public static void main(String[] args) {

         Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        System.out.println(eligibility(age));
        sc.close();
        
    }

    static String eligibility(int age){
        if (age >=18){
            return "Eligible to vote";

        }
        if (age<=0){
            return "Invalid input";
        }
          else{
            return "Not eligible";
        }
    }
    
}
