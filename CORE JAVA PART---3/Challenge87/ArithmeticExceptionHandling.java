package Challenge87;

import java.util.Scanner;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        //1> TAKING USER INPUT
        Scanner input = new Scanner(System.in);
        //2>user input
        System.out.println("welcome to Arithmetic Exception Handling\n");
        System.out.println("Please,enter the  two numbers:\n ");
        System.out.print("Please enter the first number:  ");
        int firstNumber = input.nextInt();
        System.out.print("Please enter the second number:  ");
        int secondNumber = input.nextInt();
        //3> get result
        try {
            int result = firstNumber / secondNumber;
            System.out.printf("The result is %d ", result);
        } catch (ArithmeticException exception) {
            exception.getCause();
            System.out.printf("%s Please enter the valid values\n",exception.getCause());
            if(exception.getMessage()
                    .equals("/ by zero")){
                System.out.println("Divide by zero occurreddddd....!!!!!!!!!");

            }else {
                throw exception;
            }
        }

    }
}


