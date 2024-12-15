import java.util.Scanner;

import javax.swing.text.Position;
public class Challenge68 {
    public static void main(String[] args) {
        
        //Create a program using recursion to display the Fibonacci series upto a certain number.
       //1>USER INPUT
       Scanner input=new Scanner(System.in);
       System.out.println("WELCOME TO THE PRINTING OF FIBONACCI SERIES USING RECURSSION:\n");
       System.out.print("ENTER THE NUMBER OF ELEMENTS TO BE PRINTED:");
       int count=input.nextInt();
       //3>LOOP TO GET THE POSITION ONE AFTER THE OTHER
       for(int i=1;i<=count;i++){
        System.out.println(fibonacci(i) + " ");
       }



    }
    //2>methods/dunctions
    public static int fibonacci(int position){
        //n fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
        // The first two numbers of fibonacci series are 0 and 1.

        //TO CHECK HOW MANY TIMES METHODS CALL
        System.out.print(".");
        if(position==1){
            return 0;
        }
        if(position==2){
            return 1;

        }
        return fibonacci(position-1)+fibonacci(position-2); //main logic



    }
    
}
