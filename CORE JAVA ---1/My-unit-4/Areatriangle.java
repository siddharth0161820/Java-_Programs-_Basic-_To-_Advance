import java.util.Scanner;

public class Areatriangle {
    public static void main(String[] args) {
        //WAP to calculate area of a triangle=1/2*base*height;
         //using user input method
       Scanner input=new Scanner(System.in);//read user input
       //Reading user input
       System.out.println("CHECKING THE AREA OF THE TRIANGLE: ");
       System.out.println("ENTERING THE  BASE OF THE TRIANGLE in cms:");
       int Base= input.nextInt();
       System.out.println("ENTERING THE  HEIGHT OF THE TRIANGLE in cms:");
       int Height= input.nextInt();
       double Area = 0.5*Base*Height;
       System.out.println("The Area Of the Triangle: "+Area+"cms2");

    }

    
}
