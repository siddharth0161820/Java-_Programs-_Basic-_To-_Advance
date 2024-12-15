import java.util.Scanner;

public class Unaryoperators {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a = input.nextInt();

        /// UNARY OPERATOR
        //1>A=-A; //converts a positive value to a negative
        System.out.println(a=-a);

        //2>A=++A; //pre increment --increment the value by 1 and then use it in our statement
        System.out.println(a=++a);

        //3>A=A++; //post increment --increment the value by 1 and then use it in our statement
        System.out.println(a=a++);
        System.out.println(a=a+3);

          //4>A=--A; //pre decrement --decrement the value by 1 and then use it in our statement
          int a1;
          a1=9;
          System.out.println(a1=--a1);

          
          //5>A=A--; //pre decrement --decrement the value by 1 and then use it in our statement
         
          System.out.println(a1=a1--);
          System.out.println(a1);
          System.out.println(a1+1);
          
          
        
        
    }
    
}
