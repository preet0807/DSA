package Basic;
import java.util.Scanner;

public class Sol6 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        StringBuilder rev= new StringBuilder(str);
        rev.reverse();
        sc.close();
        String res= rev.toString();
        if (res.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
            }
}

