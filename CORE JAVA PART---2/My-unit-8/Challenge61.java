import java.util.Scanner;

public class Challenge61 {
    public static void main(String[] args) {
        //Create a program using for loop multiplication table for a number.
        //1> USER INPUT
        Scanner input=new Scanner(System.in);
        //2> reading input
        System.out.println("WELCOME TO THE PRINTING TABLES\n ");
        System.out.println("PLEASE,ENTER THE NUMBER YOU WANT TO PRINT THE TABLE OF: ");
        int num=input.nextInt();
         

        //for loop
        for(int i=1;i<=10;i++){
            System.out.println(num + " X " + i + " = "+ (num*i));
        }
         
        
      
        }
    }
    

