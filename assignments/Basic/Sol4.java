
package Basic;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Sol4 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        System.out.println(us);
        sc.close();
    
}
}
