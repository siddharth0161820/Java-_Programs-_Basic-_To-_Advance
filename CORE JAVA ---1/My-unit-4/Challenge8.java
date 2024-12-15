import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
        ///CREATE A PROGRAM THAT TAKES TWO NUMBERS AND SHOWS RESULT OF ALL ARITHMETIC OPERATORS(+,-,*,/,%)
        //SOLVE USING SCANNER CLASS METHOD
        Scanner input=new Scanner(System.in); //using user input method
        
        //READING USER INPUT
        System.out.println("ENTER THE NUMBER A: ");
        int A =input.nextInt();

        System.out.println("ENTER THE NUMBER B: ");
        int B =input.nextInt();

        int a1=A+B;
        int a2=A-B;
        int a3=A*B;
        int a4=A/B;
        int a5=A%B;
    
        
        // 1>ADDITION +
        System.out.println("WELCOME TO ARITHMETIC OPERATIONS");
        System.out.println("THE SUM OF TWO NUMBERS: "+  a1);

        // 2>SUBTRACTION -
        
        System.out.println("THE DIFFERENCE OF TWO NUMBER: "+ a2);


        // 3>MULTIPLICATION *
       
        System.out.println("THE PRODUCT  OF TWO NUMBERS: "+ a3 );

        // 4>DIVISION /
        
        System.out.println("THE DIVISON OF TWO NUMBERS: "+ a4);


         // 5>MODULUS %
        
         System.out.println("THE MOD OF TWO NUMBERS: "+ a5);


         System.out.println("THANKS WE ARE DONE WITH ARITHMETIC OPERATIONS");






        
    }
    
}
