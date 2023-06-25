package Basic;
import java.util.Scanner;

// public class Leap{
//     public static void main(String[] args) {

//         Scanner sc= new Scanner(System.in);
//         int a= sc.nextInt();
//         boolean isleap= false;
//         if (a%4==0){
//             if(a%100==0){
//                 if(a%400==0){
//                     isleap=true;
//                 }
//                 isleap=false;
//             }
//             isleap=true;
//         }
//         if(isleap){
//             System.out.println("Leap");
//         }
//         else{
//             System.out.println("Not leap");
//         }




//         sc.close();  
//     }
// }

public class Leap {
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
         int year= sc.nextInt();
         sc.close();
        
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
