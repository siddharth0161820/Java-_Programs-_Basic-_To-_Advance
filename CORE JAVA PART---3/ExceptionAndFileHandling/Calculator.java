package ExceptionAndFileHandling;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //1> TAKING USER INPUTT
        Scanner input = new Scanner(System.in);
        //2>Reading user input
        System.out.println("welcome to the Division calculator world\n");
        System.out.print("Please,enter the  two numbers: ");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();

          //Here,we have to understand that in future here, an exception
        //might occur if divided by zero(0) so that need to be resolved beforehand.....using TRU-CATCH

        //try-catch is like if-else ifff any exception seen then only it traverse to catch else gets printed in try
        //itself and out of try-catch
//        try {
//            int result = firstNum/secondNum;
//            System.out.printf("The result is %d ", result);
//
//        }catch(ArithmeticException Division){   //(exception type anyname)
//            Division.getCause(); //reason why exception occurred
//            Division.getMessage(); // due to exception what gets printed over the console window..
//           // System.out.println("Divide by zero, please enter the valid values ");
//            System.out.printf("%s Please enter the valid values\n",Division.getCause());
//            System.out.printf("%s Please enter the valid values\n",Division.getMessage());
//
//        }
        //3>NOTE ---WE MIGHT HAVE MULTIPLE EXCEPTIONS IN THE CODE SO TO DEAL WITH IT WE NEED TO HAVE MULTIPLE
        //CATC BLOCK...LETS SEEEEEE..............!!!!!!!!!!!
//        try {
//            int[] newArr = new int[5]; //an array of int data type with array.length=5;
//            System.out.printf("The result is %d ", newArr[6]);
//            newArr[6]=firstNum/secondNum;  //array of length 6 ;;invalid length of an array//
//            System.out.printf("The result is %d ", newArr[6]);
//            //Here(line no-36),we might have multiple exceptions in the try block
//            // that is newArr[6]--arrayindex out of bound
//            //2> firstNum/secondNum; --if divide by zero then we can experience arithmeticExceptions
//            //3>whatever at right hand side gets executed firsttt---int[] newArr = new int[5];
//
//
//        }catch(ArithmeticException Division){   //(exception type anyname)
//            Division.getCause(); //reason why exception occurred
//            Division.getMessage(); // due to exception what gets printed over the console window..
//            // System.out.println("Divide by zero, please enter the valid values ");
//            System.out.printf("%s Please enter the valid values\n",Division.getCause());
//            System.out.printf("%s Please enter the valid values\n",Division.getMessage());
//
//        }
        //////Here we see that catch block is not universal for all exceptions and can only catch exceptions that metnioned BY US IN CATCH BLOCK
//     ERROR WE SEE-   Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
//        at ExceptionAndFileHandling.Calculator.main(Calculator.java:36)..
     //4>   ////////////////SOLUTION FOR THIS ERROR WE NEED TO DESIGN MULTIPLE CATCH BLOCK

        try {

            int[] newArr = new int[5]; //an array of int data type with array.length=5;
        // System.out.printf("The result is %d ", newArr[6]);
            newArr[6]=firstNum/secondNum;  //array of length 6 ;;invalid length of an array//
            System.out.printf("The result is %d ", newArr[6]);
            //Here(line no-36),we might have multiple exceptions in the try block
            // that is newArr[6]--arrayindex out of bound
            //2> firstNum/secondNum; --if divide by zero then we can experience arithmeticExceptions
            //3>whatever at right hand side gets executed firsttt---int[] newArr = new int[5];


        }
        catch(ArithmeticException Division){//(exception type anyname)
           Division.getCause(); //reason why exception occurred
          Division.getMessage(); // due to exception what gets printed over the console window..
            System.out.println("Divide by zero, please enter the valid values ");
           System.out.printf("%s Please enter the valid values\n",Division.getCause());
           System.out.printf("%s Please enter the valid values\n",Division.getMessage());

        }
        catch (Throwable th){
            System.out.println("General exceptions");
            throw  th;

        }
        }
    }




