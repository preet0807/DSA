package Basic;
import java.util.Scanner;

public class Sol3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int sum=0;
    sc.close();
        while(true){
        String a= sc.nextLine();
            if(a.equals("x")){
                break;
            }
            int var= Integer.parseInt(a);
            sum=sum+var;
       




        }
         System.out.println(sum);
    }
    
}
