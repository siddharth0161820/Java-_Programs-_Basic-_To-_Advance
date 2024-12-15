import java.util.Scanner;

public class Challenge24 {
    public static void main(String[] args) {
        
        //WAP THAT SHOWS BITWISE COMPLIMENT OF A NUMBER
         //USER INPUT METHOD
         Scanner input=new Scanner(System.in);
         //READING USER INPUT
         System.out.println("LETS SEE THE BITWISE COMPLIMENT/NOT OPERATOR OF THE TWO NUMBERS");
         System.out.print("LET THE NUMBER BE:");
         int myFirstNumberr= input.nextInt();
        int resultt =	~myFirstNumberr;
        System.out.println("YOUR RESULT IS: "+resultt);

    }
    
}
