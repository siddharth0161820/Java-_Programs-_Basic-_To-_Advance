import java.util.Scanner;

public class Challenge23 {
    public static void main(String[] args) {
        //WAP THAT SHOWS BITWISE XOR OF TWO NUMBERS 
         //USER INPUT METHOD
         Scanner input=new Scanner(System.in);
         //READING USER INPUT
         System.out.println("LETS SEE THE BITWISE XOR  OF THE TWO NUMBERS");
         System.out.print("LET THE FIRST NUMBER BE:");
         int myFirstNumberr= input.nextInt();
         System.out.print("LET THE SECOND NUMBER BE:");
         int mySecondNumberr= input.nextInt();
 
        int resultt =myFirstNumberr ^ mySecondNumberr;
        System.out.println(resultt);
    
       
    
}
}
