import java.util.Scanner;  // Import the Scanner class

public class Userinput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   //object initialization // Create a Scanner object

        System.out.println("Please Enter Your Name: ");

        //1> nextLine()	Reads a String value from the user

        String name = input.nextLine();// Read user input

        System.out.println("Good Morning  "  + name); // Output user input //Sting Concetination--concatenation is the operation of joining character strings end-to-end.
         

         
         System.out.print("Please Enter Your Name: ");
         //1> nextLine()	Reads a String value from the user

         String Name = input.nextLine();// Read user input

         System.out.println("Good Morning  "  + Name);// Output user input
    }
    
}


