package Conditional;
import java.util.Scanner;
//writing teh code for all other similar questions in the comments:-
// Area Of Triangle
//Area Of Rectangle Program
//Area Of Isosceles Triangle
//Area Of Parallelogram
//Area Of Rhombus
//Area Of Equilateral Triangle
//Perimeter Of Circle, Perimeter Of Equilateral Triangle,Perimeter Of Parallelogram Perimeter Of Rectangle Perimeter Of Square Perimeter Of Rhombus Volume Of Cone Java Program Volume Of Prism Volume Of Cylinder Volume Of Sphere Volume Of Pyramid

public class Loops {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        double r= sc.nextDouble();
        // double base= sc.nextDouble();
        // double height= sc.nextDouble();
        System.out.println("The area of circle is"+Area(r));
        sc.close();
    }

    static double Area(double r){  
        double pi= 3.14;
        double area= pi*r*r;
        return area;
    }
    /*
     
     * static double Area(double r){  //
       double area= (base*height)/2 FOR TRIANGLE
       double area= (length*width) FOR rectangle
       double area= (base*height)/2 FOR Isosceles TRIANGLE
       double area= (base*height) FOR PARALLELOGRAM
       double area= (diagonal1* diagonal2)/2 FOR RHOMBUS
       double area= (base*height) FOR PARALLELOGRAM
        return area;
    }
     */
}
