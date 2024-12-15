import java.util.Scanner; // this scanner class is used to get user input & found in java.util package


public class Orderofoperation {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in); //Using User input method
        System.out.println("WELCOME TO ORDER OF OPERATION");
        //Reading User Input

        System.out.println("Enter the Value of A: ");
        int a =input.nextInt();                                                                                                                                            

        System.out.println("Enter the Value of B: ");
        int b =input.nextInt();

        int c= a/b+24-25/5;
        System.out.println("The Simplification of the given Expressions: " +c);

        //If having same operator traverse from left --------->right
        System.out.println(9/3/3);
        System.out.println(9/(3/3));

        
    }
    
}
