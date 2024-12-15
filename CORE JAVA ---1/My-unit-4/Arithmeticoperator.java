import java.util.Scanner;// this scanner class is used to get user input & found in java.util package

public class Arithmeticoperator {
    public static void main(String[] args) {
        
        // Arithmetic operator using user input
        Scanner input =new Scanner(System.in);//using user input method
        System.out.println("welcome to Arithmetic operator");

        //Reading user input
        System.out.println("Enter the value of A: ");
        int a= input.nextInt();

        System.out.println("Enter the value of B: ");
        int b= input.nextInt();
         
        int c= a+b;
        int d =a-b;
        int e= a*b;
        int f=a/b;
        int g = a%b;

        System.out.println("Lets do arithmetic operator");
       System.out.println("The Addition of two number: " + c);
       System.out.println("The Substraction of two number: " + d);
       System.out.println("The Multiplication of two number: " + e);
       System.out.println("The Division of two number: " + f);
       System.out.println("The Modulus of two number: " + g);

        //Reading user input
        System.out.println("Enter the value of A1: ");
        double a1= input.nextDouble(); 
        System.out.println(a1);

        System.out.println("Enter the value of B1: ");
        double b1= input.nextDouble();
        System.out.println(b1);
        
         
        double c1= a1+b1;
        double d1 =a1-b1;
        double e1= a1*b1;
        double f1 =a1/b1;
        double g1 = a1%b1;
        System.out.println("Letssss do arithmetic operator");
        System.out.println("The Addition of two number: " + c1);
        System.out.println("The Substraction of two number: " + d1);
        System.out.println("The Multiplication of two number: " + e1);
        System.out.println("The Division of two number: " + f1);
        System.out.println("The Modulus of two number: " + g1);





    }
    
}
