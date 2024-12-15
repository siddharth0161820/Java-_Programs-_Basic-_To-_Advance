package ExceptionAndFileHandling;

import java.util.Scanner;

public class FinallyBlock {

        public static void main(String[] args) {
            a(); //calling a () methodd............

        }
        private static void a(){
            //method () a calls method() b()
            b();

        }
        private static void b(){
            c();

        }
        private static void c(){
            d();

        }
        private static void d(){ //exception under d() methods........
            //1> TAKING USER INPUTT
            Scanner input = new Scanner(System.in);
            //2>Reading user input
            System.out.println("welcome to the Division calculator world\n");
            System.out.print("Please,enter the  two numbers: ");
            int firstNum = input.nextInt();
            int secondNum = input.nextInt();


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
                ///////////UNDERSTANDING FINALLY BLOCK//////
            }finally {
                System.out.println("I am in finally.........!!!!!");

            }

        }
    }





