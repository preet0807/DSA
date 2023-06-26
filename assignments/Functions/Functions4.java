package Functions;

//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
// Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail 

import java.util.Scanner;

public class Functions4 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(Grade(a));
        sc.close();

        
    }
    static String Grade(int a){

        if((a>=91)&& (a<=100)){
            return "AA";
        }
                if((a>=81)&& (a<=100)){
            return "AB";
        }
                if((a>=71)&& (a<=80)){
            return "BB";
        }
                if((a>=61)&& (a<=70)){
            return "BC";
        }

                if((a>=51)&& (a<=60)){
            return "CD";
        }

                if((a>=41)&& (a<=50)){
            return "DD";
        }

                if(a<=40){
            return "Fail";
        }
                return null;






    }
    
}
