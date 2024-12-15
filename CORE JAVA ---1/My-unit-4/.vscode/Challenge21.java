import java.util.Scanner;

public class Challenge21 {
    public static void main(String[] args) {
        //WAP THAT SHOWS BITWISE AND OF THE TWO NUMBERS
        //USER INPUT METHOD
        Scanner input=new Scanner(System.in);
        //READING USER INPUT
        System.out.println("LETS SEE THE BITWISE AND OF THE TWO NUMBERS");
        System.out.print("LET THE FIRST NUMBER BE:");
        int myFirstNumber= input.nextInt();
        System.out.print("LET THE SECOND NUMBER BE:");
        int mySecondNumber= input.nextInt();

       int result =myFirstNumber & mySecondNumber;
       System.out.println(result);
        }



        
    }
    

